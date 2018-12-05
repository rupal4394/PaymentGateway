package com.paymentgateway.dao;
import java.sql.*;

import com.payment.DBConn;
import com.paymentgateway.model.*;
import java.text.*;
import java.util.*;

public class TransactionDao {
	
	public static boolean addData(Transaction t) {;
		
	boolean result = false;
	Connection con = null;
    ResultSet rs = null; 
    PreparedStatement stmt = null;    
	    
    String addQuery =   "insert into transactions(user_id, encrypted_data) values (?,?);";
	
	try 
    {
  	  DBConn conn = new DBConn();
  	  con = conn.getConnection();        
       stmt=con.prepareStatement(addQuery);
       stmt.setInt(1, t.getUser_id());
       stmt.setString(2, t.getData());
       stmt.executeUpdate();	
       System.out.println("Record is inserted into transaction table!");
    } 
	catch (Exception ex) 
    {
       System.out.println("Error" + ex);
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
	
		
	return result;
	}

}
