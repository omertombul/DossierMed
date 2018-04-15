/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import com.inf600c.dossiermedical.affichage.FormulaireTraitement;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Lado
 */
public class main {
    
    public static Connection conn;
    
    public static void main(String args[]) throws SQLException {
        
        SqlConnection sqlConn = new SqlConnection();
        conn = sqlConn.getConnection();
        
        readSQLData();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormulaireTraitement().setVisible(true);
            }
        });
    }    
    public static void readSQLData() throws SQLException{


        Statement statement;

        statement = conn.createStatement();

//            String result = "";
        ResultSet rs;
        rs = statement.executeQuery("SELECT textProcedure FROM Procedure WHERE idProcedure = 2");

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
