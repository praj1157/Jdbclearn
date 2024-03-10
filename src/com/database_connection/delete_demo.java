
package com.database_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class delete_demo {
    public static void main(String args[]) throws Exception
    {
        String email1 = "vijay@gmail.com";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","prince@2002");
        PreparedStatement ps = conn.prepareStatement("delete from register where email=?");
        ps.setString(1, email1);
        
        int count = ps.executeUpdate();
        
        
        if(count>0)
        {
            System.out.println("deeletion success");
        }
        else
        {
            System.out.println("deletion failed");
        }
    }
    
}
