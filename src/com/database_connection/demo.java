
package com.database_connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;


public class demo {
    public static void main(String args[]) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        //_____________User values____________________
        System.out.println("Enter name : ");
        String name1 = sc.nextLine();
        System.out.println("Enter email : ");
        String email1 = sc.nextLine();
        System.out.println("Enter password : ");
        String pass1 = sc.nextLine();
        System.out.println("Enter gender");
        String gender1 = sc.nextLine();
        System.out.println("Enter city : ");
        String city1 = sc.nextLine();
        
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","prince@2002");
        
        //testing purpose
//        System.out.println("successfully created to the database");
        PreparedStatement ps = conn.prepareStatement("insert into register values(?,?,?,?,?)");
        ps.setString(1, name1);
        ps.setString(2, email1);
        ps.setString(3, pass1);
        ps.setString(4, gender1);
        ps.setString(5, city1);
        int i = ps.executeUpdate();
        if(i>0)
        {
            System.out.println("success");
        }
        else
        {
            System.out.println("fail");
        }
    }
   
}
