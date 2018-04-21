/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.fondation;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lado
 */
public class CreationTables {
    
    public void createTableVisite(Connection conn) throws SQLException {
        String sqlCreateTable = "CREATE TABLE IF NOT EXISTS Visite"
                + "  (idVisite          INTEGER  ,"
                + "   idMedecin         INTEGER,"
                + "   idPatient         INTEGER,"
                + "   nomEtablissement  VARCHAR(50),"
                + "   dateVisite        DATE)";

        Statement stm = conn.createStatement();
        stm.execute(sqlCreateTable);
    }
    
    public void createTableTraitement(Connection conn) throws SQLException {
        String sqlCreateTable = "CREATE TABLE IF NOT EXISTS Traitement"
                + "  (idVisite          INTEGER  ,"
                + "   idTraitement      INTEGER,"
                + "   medicament        VARCHAR(50),"
                + "   procedure         VARCHAR(50),"
                + "   hospitalisation   INTEGER)";

        Statement stm = conn.createStatement();
        stm.execute(sqlCreateTable);
    }
    
}
