/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farunurisonmez.guiexample;

import java.sql.*;

/**
 *
 * @author farunurisonmez
 */
public class DatabaseHelper {
    private String userName="root";
    private String password="root";
    private String databaseUrl = "jdbc:mysql://localhost:3306/world?useSSL=false";    
    
    public Connection getConnection() throws SQLException{
         return DriverManager.getConnection(databaseUrl,userName,password);
    }
            
    public void showErrorMessage(SQLException exception){
        System.out.print("Error : " + exception.getMessage());
        System.out.print("Error : " + exception.getErrorCode());
    }
}
