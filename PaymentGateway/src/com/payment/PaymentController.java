package com.payment;
import com.paymentgateway.model.RSA;
import com.paymentgateway.model.Transaction;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.paymentgateway.dao.LoginDao;
import com.paymentgateway.dao.TransactionDao;
import com.paymentgateway.model.RSA;
import com.paymentgateway.model.User;

public class PaymentController extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	           throws ServletException, java.io.IOException {

	try
	{	    
		String action = request.getParameter("action");
		HttpSession session = request.getSession(true);
		User user = (User) session.getAttribute("currentSessionUser");
		
		if(action.equals("pay")) {
			String name = request.getParameter("cc_name");
			String no = request.getParameter("cc_no");
			String month = request.getParameter("cc_exp_mo");
			String year = request.getParameter("cc_exp_yr");
			String cvv = request.getParameter("cvv");
			String amount = request.getParameter("amount");
			
			String data = name+System.lineSeparator()
							+no+System.lineSeparator()
							+month+System.lineSeparator()
							+year+System.lineSeparator()
							+cvv+System.lineSeparator()
							+amount+System.lineSeparator();
	
			RSA.generateKeyPair();
			byte [] encData = RSA.encrypt(RSA.privateKey, data);
			Transaction t = new Transaction();
			t.setData(new String(encData));
			t.setUser_id(user.getUser_id());			
			TransactionDao.addData(t);
			
			byte [] dec= RSA.decrypt(RSA.pubKey, encData);
			System.out.println("\n\nDecrypted   :"+new String(dec));
			
			response.sendRedirect("confirmation.jsp");
				
		}else if(action.equals("cancel")) {
			response.sendRedirect("login.jsp");
		}
		
		
	}catch (Throwable theException){
		System.out.println(theException); 
	}
	} 
}
