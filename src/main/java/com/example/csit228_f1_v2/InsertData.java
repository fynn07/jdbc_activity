package com.example.csit228_f1_v2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertData {
    public void signUp(String user, String pass){
        try(Connection c = MySQLConnection.getConnection();
            PreparedStatement statement = c.prepareStatement(
                    "INSERT INTO accounts (username,password) VALUES (?,?)"
            )){
            String username = user;
            String password = pass;
            statement.setString(1, username);
            statement.setString(2, password);
            int rows = statement.executeUpdate();
            System.out.println("Account Successfully Created");
        }catch(SQLException e){
            throw  new RuntimeException(e);
        }
    }


}
