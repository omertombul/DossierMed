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
/**
 *
 * @author Lado
 */
public class DB {
    
    CreationTables CreationTables = new CreationTables();
    SqlConnection sq = SqlConnection.getConnection();
    Statement statement;
    
    // creer novelle ligne avec idTraitemnt dans la table Traitement. 
    public void creerTraitement(int idTraitement) throws SQLException{
        CreationTables.createTableTraitement(sq.conn);
        statement = sq.conn.createStatement();
        statement.executeUpdate("INSERT INTO Traitement VALUES (" + idTraitement + ", " + 0 + ", '', '', " + 0 + ")");
    }
            
    public void sauvegarderTraitement(Traitement traitement) throws SQLException{
   
 //       readSQLData();

        statement = sq.conn.createStatement();
        statement.executeUpdate("UPDATE Traitement SET medicament = '" + traitement.getMedicament() + 
                                                    "', procedure = '" + traitement.getProcedure() + 
                                                    "', hospitalisation = '" + traitement.getHospitalisation() + 
                                                    "' WHERE idTraitement = " + traitement.getIdTraitement());
    }
    
    public void creerVisite(int idVisite) throws SQLException{
        CreationTables.createTableVisite(sq.conn);
        statement = sq.conn.createStatement();
        statement.executeUpdate("INSERT INTO Visite VALUES (" + idVisite + ",0 , 0 , '', '','')");
    }
    
    public void sauvegarderVisite(Visite visite) throws SQLException, ParseException{

        statement = sq.conn.createStatement();
        
        statement.executeUpdate("UPDATE Visite SET codeEmploye = " + visite.getMedecin().getCodeEmployeMedecin() + 
                                                ", numAssMaladie = " + visite.getPatient().getNumAssMaladie() + 
                                                ", nomEtablissement = '" + visite.getNomEtablissement() + 
                                                "', dateVisite = '" + visite.getDateVisite() + 
                                                "', note = '" + visite.getNote() +  
                                                "' WHERE idVisite = " + visite.getIdVisite());
    
    }
    
    public int getLastId(String tableName, String columnName) throws SQLException{
        
        String query = "SELECT " + columnName + " FROM " + tableName + " ORDER BY " + columnName + " DESC LIMIT 1";
        
        int id=0;
        
        statement = sq.conn.createStatement();
        
        ResultSet rs;
        rs = statement.executeQuery(query);

        if(rs.next()) {
            Object object = rs.getObject(1);
            id = (Integer)object;
            }
         return id;    
    }
    
    public void readSQLData() throws SQLException{
        
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

    }  
    
    public boolean validerNumAssMaladie(int numAssMaladie) throws SQLException{
        
        statement = sq.conn.createStatement();
        
        ResultSet rs;
        rs = statement.executeQuery("SELECT numAssMaladie FROM Patient ");
        
        while(rs.next()) {
            Object objectNumAssMaladie = rs.getObject(1);
            int valueNumAssMaladie = (Integer)objectNumAssMaladie;

            if(valueNumAssMaladie == numAssMaladie)
                return true;
        }
        return false;
    }
    
    public boolean validerIfExiste(int nombre, String nomColonne, String nomTable) throws SQLException{
       
        statement = sq.conn.createStatement();
        
        ResultSet rs;
        rs = statement.executeQuery("SELECT " + nomColonne + " FROM " + nomTable );
        
        while(rs.next()) {
            Object objectNombre = rs.getObject(1);
            int value = (Integer)objectNombre;

            if(value == nombre)
                return true;
        }
        return false;
    }
    
    public String getspecialteMedecin(int nombre, String nomColResultat, String nomColonne, String nomTable) throws SQLException{
        
        statement = sq.conn.createStatement();
        
        ResultSet rs;
        rs = statement.executeQuery("SELECT " + nomColResultat + " FROM " + nomTable + " WHERE " + nomColonne + " = " + nombre);
        
        while(rs.next()) {
            Object objectNombre = rs.getObject(1);
            String value = (String)objectNombre;

            if(!value.equals(""))
                return value;
        }
        return "";
    }
    
    public Patient getParametresPatient(int numAssMaladie) throws SQLException, ParseException{
        
        Patient patient = new Patient();
        
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
            
//            Date newDate = objectDateNaissance.getTimestamp("VALUEDATE");
            
 //           java.util.Date dateNaissance = DateVisite.convertStringToDate((String)objectDateNaissance);
            
            patient = new Patient((int)objectNumAssMaladie, (String)objectDateNaissance, (int)objectGenre,
                                   (String)objectVilleNaissance, (String)objectParent1, (String)objectParent2);

        }
        
        return patient;
    }
}
