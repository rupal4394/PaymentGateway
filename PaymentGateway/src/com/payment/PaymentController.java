package com.payment;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.paymentgateway.dao.LoginDao;
import com.paymentgateway.model.User;

public class PaymentController {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	           throws ServletException, java.io.IOException {

	try
	{	    
		String action = request.getParameter("action");
		
		if(action.equals("pay")) {
			
		
				
		}else if(action.equals("cancel")) {
			response.sendRedirect("login.jsp");
		}
		
		
	}catch (Throwable theException){
		System.out.println(theException); 
	}
	} 
}
