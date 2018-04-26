/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.fondation;

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

    String url = "DossierDataBase.db";
    String path = "jdbc:sqlite:" + url;
    public Connection conn = null;
    private static SqlConnection instanceConnect;
   

    private SqlConnection(){
       
        try {
             Class.forName("org.sqlite.JDBC").newInstance();
            conn = (Connection)DriverManager.getConnection(path);
            System.out.println("Connection to SQLite a été établie.");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }catch (Exception ex){
            System.out.println("Class Error" + ex.getMessage());
        }
    }
    
    
    public static SqlConnection getConnection() {
       if(instanceConnect == null){
           instanceConnect = new SqlConnection();
        }
        
       
        return instanceConnect ;
    }

}
