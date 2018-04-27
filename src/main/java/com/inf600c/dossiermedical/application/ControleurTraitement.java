/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.application;

import com.inf600c.dossiermedical.domaine.Traitement;
import com.inf600c.dossiermedical.domaine.Traitement.Builder;
import com.inf600c.dossiermedical.servicestechniques.DB;
import java.sql.SQLException;

/**
 *
 * @author vxk09291
 */
public class ControleurTraitement {

    
    
    DB db = new DB();
    Builder builderTraitement = new Traitement.Builder();
    
    public void sauvegarderTraitement(String medicament, String procedure, int hospitalisation) throws SQLException{
       
        int idTraitement = db.getLastId("Traitement", "idTraitement") + 1;
        builderTraitement.setIdTraitement(idTraitement);
        
        builderTraitement.setMedicament(medicament);
        builderTraitement.setProcedure(procedure);
        builderTraitement.setHospitalisation(hospitalisation);
        
        Traitement traitement = builderTraitement.construireTraitement();
        
        db.sauvegarderTraitement(traitement);
        
    }
    
}
