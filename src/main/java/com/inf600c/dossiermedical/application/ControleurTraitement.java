/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.application;

import com.inf600c.dossiermedical.domaine.Traitement;
import com.inf600c.dossiermedical.servicestechniques.DB;
import java.sql.SQLException;

/**
 *
 * @author vxk09291
 */
public class ControleurTraitement {

    
    
    DB db = new DB();
 //   Traitement traitement = new Traitement();
    
    public void sauvegarderTraitement(Traitement traitement) throws SQLException{
        
        db.sauvegarderTraitement(traitement);
        
    }
    
}
