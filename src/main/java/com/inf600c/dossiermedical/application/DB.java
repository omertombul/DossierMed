/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.application;

//import static application.main.conn;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.inf600c.dossiermedical.domaine.Traitement;
import com.inf600c.dossiermedical.fondation.SqlConnection;

/**
 *
 * @author Lado
 */
public class DB {
    
    public Connection conn;
    
    public void sauvegarderTraitement(Traitement traitement) throws SQLException{
        SqlConnection sqlConn = new SqlConnection();
        conn = sqlConn.getConnection();
        
        int idTraitement = getLastId("Traitement", "idTraitement") + 1;
 //       readSQLData();

        Statement statement = conn.createStatement();
        
        statement.executeUpdate("INSERT INTO Traitement VALUES (" + idTraitement + ", " + 0 + ", '" + traitement.getMedicament() + "', '" + traitement.getProcedure() + "', " + traitement.getHospitalisation() + ")");
 //       statement.executeUpdate("INSERT INTO Traitement VALUES (1, 0, 'Tyl', 'Mass', 0)");
//        statement.executeUpdate("INSERT INTO Procedure " + "VALUES (5, 'Hydrotherapie')");
    }
    
    int getLastId(String tableName, String columnName) throws SQLException{
        
        String query = "SELECT " + columnName + " FROM " + tableName + " ORDER BY " + columnName + " DESC LIMIT 1";
        
        int id=0;
        
        Statement statement;
        statement = conn.createStatement();
        
        ResultSet rs;
        rs = statement.executeQuery(query);

        if(rs.next()) {
            Object object = rs.getObject(1);
            id = (Integer)object;
            }
         return id;    
    }
    
    public void readSQLData() throws SQLException{

        Statement statement;
        statement = conn.createStatement();
        
        
        ResultSet rs;
        rs = statement.executeQuery("SELECT textProcedure FROM Procedure ");

        ResultSetMetaData metaData = rs.getMetaData();
        int columnCount = metaData.getColumnCount();

        while(rs.next()) {
            for(int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
                Object object = rs.getObject(columnIndex);
                System.out.printf("%s, ", object == null ? "NULL" : object.toString());
            }
            System.out.printf("%n");
        }

    }  
}
