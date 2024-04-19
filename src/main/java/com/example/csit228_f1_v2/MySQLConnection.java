package com.example.csit228_f1_v2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConnection {
    public static final String URL = "jdbc:mysql://localhost:3306/borjaJavaDB";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "";

    public MySQLConnection() {
    }

    static Connection getConnection() {
        Connection c = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/borjaJavaDB", "root", "");
            System.out.println("DB Connected");
        } catch (ClassNotFoundException | SQLException var2) {
            var2.printStackTrace();
        }

        return c;
    }
}
