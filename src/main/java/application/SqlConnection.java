/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lado
 */
public class SqlConnection {
    
    String path = "jdbc:sqlite:C:/Users/Lado/Desktop/Docs/Cours/INF5153/tp3/DossierDataBase.db";
    Connection conn = null;
    
    public Connection getConnection() throws SQLException{
        
            conn = DriverManager.getConnection(path);
            System.out.println("Connection to SQLite a été établie.");

        
       return conn; 
    }
    
    
}
