package com.payment;

import java.sql.*;
public class DBConn {

private String url = "jdbc:mysql://localhost:3306/paymentgateway";
private String driver = "com.mysql.jdbc.Driver";
private String userName = "root";
private String password = "root";
private Connection con = null;

public Connection getConnection() {

     try {
         Class.forName(driver);
         if(con == null){
             con = DriverManager.getConnection(url,userName,password);
         }
     }catch (Exception e) {
         System.out.print("Error : " +e.getMessage());
    }
     return con;
}

}