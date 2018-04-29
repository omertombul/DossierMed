/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.fondation;

import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Lado
 */
public class CreationTables {
    
    SqlConnection sq = SqlConnection.getConnection();
    Statement statement;

    public void createSystemTables() throws SQLException{
        
        statement = sq.conn.createStatement();
        
        String sqlCreateTableMedecin = "CREATE TABLE IF NOT EXISTS Medecin"
                                + "  (codeEmploye     INTEGER  ,"
                                + "   specialite      VARCHAR(50))";
        statement.execute(sqlCreateTableMedecin);
        
        String sqlCreateTablePatient = "CREATE TABLE IF NOT EXISTS Patient"
                                + "  (numAssMaladie      INTEGER  ,"
                                + "   dateNaissance      VARCHAR(10),"
                                + "   genre              INTEGER,"
                                + "   villeNaissance     VARCHAR(50),"
                                + "   parent1            VARCHAR(50),"
                                + "   parent2            VARCHAR(50))";
        
        statement.execute(sqlCreateTablePatient);
        
        String sqlCreateTablePersonne = "CREATE TABLE IF NOT EXISTS Personne"
                                + "  (nom                VARCHAR(50),"
                                + "   prenom             VARCHAR(50),"
                                + "   numAssMaladie      INTEGER)";
        
        statement.execute(sqlCreateTablePersonne);
        
        String sqlCreateTablePersonnel = "CREATE TABLE IF NOT EXISTS Personnel"
                                + "  (codeEmploye        INTEGER  ,"
                                + "   numAssMaladie      INTEGER)";
        
        statement.execute(sqlCreateTablePersonnel);
        
        String sqlCreateTableAntecedent = "CREATE TABLE IF NOT EXISTS Antecedent"
                                + " (numAssMaladie INTEGER,"
                                + "  diagnostique VARCHAR(256),"
                                + "  procedure VARCHAR(256),"
                                + "  nomMedecin VARCHAR(50),"
                                + "  dateDebutTraitement VARCHAR(10)," 
                                + "  dateFinTraitement VARCHAR(10))";
        
        statement.execute(sqlCreateTablePersonnel);
        
        String sqlCreateTableVisite = "CREATE TABLE IF NOT EXISTS Visite"
                + "  (idVisite          INTEGER,"
                + "   codeEmploye       INTEGER,"
                + "   numAssMaladie     INTEGER,"
                + "   nomEtablissement  VARCHAR(50),"
                + "   dateVisite        VARCHAR(10),"
                + "   note              VARCHAR(256))";
        
        statement.execute(sqlCreateTableVisite);
        
        String sqlCreateTableTraitement = "CREATE TABLE IF NOT EXISTS Traitement"
                + "  (idTraitement      INTEGER,"
                + "   idVisite          INTEGER,"
                + "   medicament        VARCHAR(50),"
                + "   procedure         VARCHAR(50),"
                + "   hospitalisation   INTEGER)";

        statement.execute(sqlCreateTableTraitement);

        String sqlCreateTableDiagnostique = "CREATE TABLE IF NOT EXISTS Diagnostique"
                + "  (idVisite          INTEGER  ,"
                + "   diagnostique      VARCHAR(256))";
        
        statement.execute(sqlCreateTableDiagnostique);
        
        fillOutTablesData();
    }
    
    public void fillOutTablesData() throws SQLException{
        statement = sq.conn.createStatement();
        
        statement.executeUpdate("INSERT INTO Medecin VALUES (777000777, 'Psychiatre')");
        statement.executeUpdate("INSERT INTO Medecin VALUES (111888999, 'Physiotherapeute')");
        
        statement.executeUpdate("INSERT INTO Patient VALUES (911911911, '02-25-1995', 1, 'Toronto', 'Steve', 'Aisha')");
        statement.executeUpdate("INSERT INTO Patient VALUES (777777777, '03-18-1975', 1, 'Quebec', 'Martin', 'Nicole')");
        
        statement.executeUpdate("INSERT INTO Personne VALUES ('Doctor', 'Emilie', 111222333)");
        statement.executeUpdate("INSERT INTO Personne VALUES ('Mydoctor', 'Katia', 100200300)");
        statement.executeUpdate("INSERT INTO Personne VALUES ('Professionnelle', 'Nadia', 690690690)");
        statement.executeUpdate("INSERT INTO Personne VALUES ('Fakedoctor', 'Lucy', 444555666)");
        statement.executeUpdate("INSERT INTO Personne VALUES ('Mauvaispatient', 'Mahmoud', 911911911)");
        statement.executeUpdate("INSERT INTO Personne VALUES ('Fakehandicap', 'Jille', 777777777)");

        statement.executeUpdate("INSERT INTO Personnel VALUES (111888999, 111222333)");
        statement.executeUpdate("INSERT INTO Personnel VALUES (555666777, 690690690)");
        statement.executeUpdate("INSERT INTO Personnel VALUES (777000777, 100200300)");
        statement.executeUpdate("INSERT INTO Personnel VALUES (999666111, 444555666)");

        statement.executeUpdate("INSERT INTO Visite VALUES (1, 777000777, 911911911, 'Bordele', '20-04-2018', 'Excellent')");
        statement.executeUpdate("INSERT INTO Visite VALUES (2, 111888999, 911911911, 'Hopitale', '21-04-2018', 'Malade')");
        statement.executeUpdate("INSERT INTO Visite VALUES (3, 777000777, 777777777, 'Maison', '20-04-2018', 'Content')");
        statement.executeUpdate("INSERT INTO Visite VALUES (4, 111888999, 777777777, 'Hopitale', '21-04-2018', 'Fache')");

        statement.executeUpdate("INSERT INTO Traitement VALUES (1,1, 'Huile', 'Massage', 0)");
        statement.executeUpdate("INSERT INTO Traitement VALUES (2,2, 'Tylenole', 'Boire tylenole', 1)");
        statement.executeUpdate("INSERT INTO Traitement VALUES (3,3, 'Vallium', 'Boire vallium', 1)");
        statement.executeUpdate("INSERT INTO Traitement VALUES (4,4, 'Morfine', 'Rein faire', 1)");
        
        statement.executeUpdate("INSERT INTO Diagnostique VALUES (1, 'Malade mentale')");
        statement.executeUpdate("INSERT INTO Diagnostique VALUES (2, 'Toujour fatigue')");
        statement.executeUpdate("INSERT INTO Diagnostique VALUES (3, 'Idiot anormal')");
        statement.executeUpdate("INSERT INTO Diagnostique VALUES (4, 'Mal au pied')");

    }
}
