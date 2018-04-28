/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.servicestechniques;

//import static application.main.conn;
import com.inf600c.dossiermedical.domaine.Patient;
import java.sql.*;
import java.sql.SQLException;

import com.inf600c.dossiermedical.domaine.Traitement;
import com.inf600c.dossiermedical.domaine.Visite;
import com.inf600c.dossiermedical.fondation.CreationTables;
import com.inf600c.dossiermedical.fondation.SqlConnection;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Lado
 */
public class DB {
    
    CreationTables CreationTables = new CreationTables();
    SqlConnection sq = SqlConnection.getConnection();
    Statement statement;
    
    public void creerTableTraitement(){
        try {
            statement = sq.conn.createStatement();
            CreationTables.createTableTraitement(sq.conn);
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // creer novelle ligne avec idTraitemnt dans la table Traitement. 
    public void creerTraitement(int idTraitement){
        try {
            statement = sq.conn.createStatement();
            
            boolean idTraitementExiste = validerIfExiste(idTraitement, "idTraitement", "Traitement");

            if(!idTraitementExiste)
                statement.executeUpdate("INSERT INTO Traitement VALUES (" + idTraitement + ", " + 0 + ", '', '', " + 0 + ")");
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    public void sauvegarderTraitement(Traitement traitement){
   
        try {
            statement = sq.conn.createStatement();
            statement.executeUpdate("UPDATE Traitement SET medicament = '" + traitement.getMedicament() + 
                                                    "', procedure = '" + traitement.getProcedure() + 
                                                    "', hospitalisation = '" + traitement.getHospitalisation() + 
                                                    "' WHERE idTraitement = " + traitement.getIdTraitement());
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void creerTableVisite(){
        try {
            statement = sq.conn.createStatement();
            CreationTables.createTableVisite(sq.conn);
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void creerVisite(int idVisite){
        try {
            statement = sq.conn.createStatement();
            
            boolean idVisiteExiste = validerIfExiste(idVisite, "idVisite", "Visite");

            if(!idVisiteExiste)
                statement.executeUpdate("INSERT INTO Visite VALUES (" + idVisite + ",0 , 0 , '', '','')");
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sauvegarderVisite(Visite visite) throws ParseException{

        try {
            statement = sq.conn.createStatement();
            statement.executeUpdate("UPDATE Visite SET codeEmploye = " + visite.getMedecin().getCodeEmployeMedecin() + 
                                                ", numAssMaladie = " + visite.getPatient().getNumAssMaladie() + 
                                                ", nomEtablissement = '" + visite.getNomEtablissement() + 
                                                "', dateVisite = '" + visite.getDateVisite() + 
                                                "', note = '" + visite.getNote() +  
                                                "' WHERE idVisite = " + visite.getIdVisite());
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void creerDiagnostique(int idVisite, String textDiagnostique){
        try {
            CreationTables.createTableDiagnostique(sq.conn);
            statement = sq.conn.createStatement();
        
            boolean idVisiteExiste = validerIfExiste(idVisite, "idVisite", "Diagnostique");

            if(idVisiteExiste)
                statement.executeUpdate("UPDATE Diagnostique SET diagnostique = '" + textDiagnostique + "' WHERE idVisite = " + idVisite);   
            else
                statement.executeUpdate("INSERT INTO Diagnostique VALUES (" + idVisite + ", '" + textDiagnostique + "')");
    
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int getLastId(String tableName, String columnName){
        
        String query = "SELECT " + columnName + " FROM " + tableName + " ORDER BY " + columnName + " DESC LIMIT 1";
        
        int id=0;
        
        try {
            statement = sq.conn.createStatement();
            ResultSet rs;
            rs = statement.executeQuery(query);

            if(rs.next()) {
                Object object = rs.getObject(1);
                id = (Integer)object;
                }
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
         return id;    
    }
    
    public void readSQLData(){
        
        try {
            statement = sq.conn.createStatement();
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
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }  
    
    public boolean validerNumAssMaladie(int numAssMaladie){
        
        try {
            statement = sq.conn.createStatement();
            ResultSet rs;
            rs = statement.executeQuery("SELECT numAssMaladie FROM Patient ");

            while(rs.next()) {
                Object objectNumAssMaladie = rs.getObject(1);
                int valueNumAssMaladie = (Integer)objectNumAssMaladie;

                if(valueNumAssMaladie == numAssMaladie)
                    return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean validerIfExiste(int nombre, String nomColonne, String nomTable){
       
        try {
            statement = sq.conn.createStatement();
            ResultSet rs;
            rs = statement.executeQuery("SELECT " + nomColonne + " FROM " + nomTable );

            while(rs.next()) {
                Object objectNombre = rs.getObject(1);
                int value = (Integer)objectNombre;

                if(value == nombre)
                    return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return false;
    }
    
    public String getspecialteMedecin(int nombre, String nomColResultat, String nomColonne, String nomTable){
        
        try {
            statement = sq.conn.createStatement();
            ResultSet rs;
            rs = statement.executeQuery("SELECT " + nomColResultat + " FROM " + nomTable + " WHERE " + nomColonne + " = " + nombre);

            while(rs.next()) {
                Object objectNombre = rs.getObject(1);
                String value = (String)objectNombre;

                if(!value.equals(""))
                    return value;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return "";
    }
    
    public Patient getParametresPatient(int numAssMaladie) throws ParseException{
        
        Patient patient = new Patient();
        
        try {
            statement = sq.conn.createStatement();
            ResultSet rs;
            rs = statement.executeQuery("SELECT * FROM Patient WHERE numAssMaladie = " + numAssMaladie);

            while(rs.next()) {
                Object objectNumAssMaladie = rs.getObject(1);
                Object objectDateNaissance = rs.getObject(2);
                Object objectGenre = rs.getObject(3);
                Object objectVilleNaissance = rs.getObject(4);
                Object objectParent1 = rs.getObject(5);
                Object objectParent2 = rs.getObject(6);

               patient = new Patient((int)objectNumAssMaladie, (String)objectDateNaissance, (int)objectGenre,
                                       (String)objectVilleNaissance, (String)objectParent1, (String)objectParent2);
            }
        
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return patient;
    }
/*    
    public boolean idExiste(String table, String columnName, int id) throws SQLException{
        statement = sq.conn.createStatement();
        
        ResultSet rs = statement.executeQuery("SELECT EXISTS(SELECT 1 FROM " + table + " WHERE " + columnName + " = " + id + ")");
        
        while(rs.next()) {
            Object objectID = rs.getObject(1);
            
            if((int)objectID == 1)
                return true;            
        }
        return false;
    }
*/    
    
}
