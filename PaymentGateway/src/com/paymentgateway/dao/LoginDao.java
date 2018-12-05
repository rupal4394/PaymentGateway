package com.paymentgateway.dao;
import java.sql.*;

import com.payment.DBConn;
import com.paymentgateway.model.*;
import java.text.*;
import java.util.*;
import java.sql.*;

public class LoginDao {

	public static User login(User user) {
		
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
	            user.setUser_id(0);
	         } 
		        
	         //if user exists set the isValid variable to true
	         else if (more) 
	         {
	            String Name = rs.getString("user_name");
	            String id = rs.getString("user_id");
		     	user.setUser_id(Integer.parseInt(id));
	         }
	      } 
	      catch (Exception ex) 
	      {
	         System.out.println("Log In failed: An Exception has occurred! " + ex);
	      } 
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
		
		return user;
	}

}
