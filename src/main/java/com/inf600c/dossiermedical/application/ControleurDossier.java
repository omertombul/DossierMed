/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.application;

import com.inf600c.dossiermedical.domaine.Dossier;
import com.inf600c.dossiermedical.fondation.CreationTables;
import com.inf600c.dossiermedical.servicestechniques.DB;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lado
 */
public class ControleurDossier {
    
    CreationTables CreationTables = new CreationTables();
    DB db = new DB();
    
    public void creationDeTablesSysteme(){
        try {
            CreationTables.createSystemTables();
        } catch (SQLException ex) {
            Logger.getLogger(ControleurDossier.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList trouverVisitesPatient(){
        return db.trouverListeVisites(Dossier.numAssMaladie);
    }
        
    public ArrayList trouverAttributesVisite(int numAssMaladie, String dateVisite){
        return db.trouverAttributesVisite(numAssMaladie, dateVisite);
    }
}
