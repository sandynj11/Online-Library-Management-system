/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jframe;

import java.sql.*;

/**
 *
 * @author santhoshkumar
 */
public class DatabaseConnection {
    static Connection conn = null;
    
    public static Connection getConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Library","root","");
        } catch(Exception e){
            e.printStackTrace();
            
            
        }
        return conn;
    }
}
