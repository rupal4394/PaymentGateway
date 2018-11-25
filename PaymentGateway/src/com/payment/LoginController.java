package com.payment;
import com.paymentgateway.model.RSA;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.paymentgateway.dao.LoginDao;
import com.paymentgateway.model.User;


public class LoginController extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response) 
	           throws ServletException, java.io.IOException {

	try
	{	    
		User user = new User();
		user.setName(request.getParameter("userName"));
		user.setPassword(request.getParameter("password"));
		String action = request.getParameter("action");
		
		if(action.equals("submit")) {
			if (LoginDao.login(user))
			{
				HttpSession session = request.getSession(true);	    
				session.setAttribute("currentSessionUser",user); 
				
				RSA.generateKeyPair();
				session.setAttribute("publicKey", RSA.getPubKey());			
				
				response.sendRedirect("payment.jsp");     		
			}
			else {
				request.setAttribute("errorMessage", "Invalid user or password");
				request.getRequestDispatcher("login.jsp").forward(request, response);
			}
				
		}else if(action.equals("reset")) {
			response.sendRedirect("login.jsp");
		}
		
		
	}catch (Throwable theException){
	System.out.println(theException); 
	}
	}
}
