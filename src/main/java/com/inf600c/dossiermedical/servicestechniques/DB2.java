/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.servicestechniques;

import com.inf600c.dossiermedical.domaine.Patient;
import java.sql.*;
import java.sql.SQLException;

import com.inf600c.dossiermedical.domaine.Traitement;
import com.inf600c.dossiermedical.domaine.Visite;
import com.inf600c.dossiermedical.fondation.CreationTables;
import com.inf600c.dossiermedical.fondation.SqlConnection;
import java.awt.List;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lado
 */
public class DB2 {
    
    CreationTables CreationTables = new CreationTables();
    SqlConnection sq = SqlConnection.getConnection();
    Statement statement;
    
    
    public void sauvegarderModifications(ArrayList listAttributsVisite){
        try {
            statement = sq.conn.createStatement();
            
            int idVisite = 0;
            
            int numAssMaladie = Integer.parseInt((String)listAttributsVisite.get(0));
            
            String query = "SELECT idVisite FROM Visite WHERE numAssMaladie = " + numAssMaladie
                                                          + " and dateVisite = '" + (String)listAttributsVisite.get(2)+ "'";
            
            ResultSet rs = statement.executeQuery(query);

            if(rs.next()) {
                Object object = rs.getObject(1);
                idVisite = (Integer)object;
                }
 
            statement.executeUpdate("UPDATE Visite SET nomEtablissement = '" + (String)listAttributsVisite.get(1)+ "'"
                                                    + ", note = '" + (String)listAttributsVisite.get(7)+ "'"
                                                    + "WHERE idVisite = " + idVisite);
 
            int hospitalisation = listAttributsVisite.get(6) == "Non Hospitalisé" ? 0 : 1;
            
            statement.executeUpdate("UPDATE Traitement SET medicament = '" + (String)listAttributsVisite.get(4)+ "'" + 
                                                    ", procedure = '" + (String)listAttributsVisite.get(5)+ "'" + 
                                                    ", hospitalisation = " + hospitalisation + 
                                                    " WHERE idVisite = " + idVisite);
            
            statement.executeUpdate("UPDATE Diagnostique SET diagnostique = '" + (String)listAttributsVisite.get(3)+ "'" + 
                                                        " WHERE idVisite = " + idVisite);
            
        } catch (SQLException ex) {
            Logger.getLogger(DB2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
    }
    
    
}
