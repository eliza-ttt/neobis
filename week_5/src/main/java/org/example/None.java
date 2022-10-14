package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class None {
    public static void main(String args[]) {

        String url = "jdbc:mysql://localhost;3306/test";
        String user = "root";
        String password = "root@123";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, user, password);
            System.out.println("Success!");


        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
