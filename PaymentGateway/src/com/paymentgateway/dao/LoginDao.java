package com.paymentgateway.dao;
import java.sql.*;

import com.payment.DBConn;
import com.paymentgateway.model.*;
import java.text.*;
import java.util.*;
import java.sql.*;

public class LoginDao {

	public static boolean login(User user) {
		
		boolean result = false;
		
		Connection con = null;
	    ResultSet rs = null;  
		
	    //preparing some objects for connection 
	    Statement stmt = null;    
		
	    String username = user.getName();   
	    String password = user.getPassword(); 
		    
	    String searchQuery =
	               "select * from user where user_name='"
	                        + username
	                        + "' AND password='"
	                        + password
	                        + "'";
	      try 
	      {
	    	  DBConn conn = new DBConn();
	    	  con = conn.getConnection();        
	         stmt=con.createStatement();
	         rs = stmt.executeQuery(searchQuery);	
	         boolean more = rs.next();
		       
	         // if user does not exist set the isValid variable to false
	         if (!more) 
	         {
	            System.out.println("Sorry, you are not a registered user! Please sign up first");
	            result = false;
	         } 
		        
	         //if user exists set the isValid variable to true
	         else if (more) 
	         {
	            String Name = rs.getString("user_name");
		     	
	            System.out.println("Welcome " + Name);
	            
	            result = true;
	         }
	      } 

	      catch (Exception ex) 
	      {
	         System.out.println("Log In failed: An Exception has occurred! " + ex);
	      } 
		    
	      //some exception handling
	      finally 
	      {
	         if (rs != null)	{
	            try {
	               rs.close();
	            } catch (Exception e) {}
	               rs = null;
	            }
		
	         if (stmt != null) {
	            try {
	               stmt.close();
	            } catch (Exception e) {}
	               stmt = null;
	            }
		
	         if (con != null) {
	            try {
	               con.close();
	            } catch (Exception e) {
	            }

	            con = null;
	         }
	      }
		
		return result;
	}

}
