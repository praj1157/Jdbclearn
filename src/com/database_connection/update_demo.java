
package com.database_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class update_demo {
    public static void main(String args[]) throws Exception
    {
       String city1 = "bihar";
       String email1 = "prince@gmail.com";
       
       Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db", "root", "prince@2002");
       PreparedStatement ps = conn.prepareStatement("update register set city=? where email=?");
       ps.setString(1, city1);
       ps.setString(2, email1);
       
       int count = ps.executeUpdate();
       if(count>0)
       {
           System.out.println("updated successfully");
       }
       else
       {
           System.out.println("updation failed");
       }
       conn.close();
    }
    
}
