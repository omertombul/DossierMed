/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.application;

import com.inf600c.dossiermedical.domaine.Dossier;
import com.inf600c.dossiermedical.domaine.Medecin;
import com.inf600c.dossiermedical.domaine.Visite;
import com.inf600c.dossiermedical.servicestechniques.DB;
import com.inf600c.dossiermedical.servicestechniques.DateVisite;
import java.sql.SQLException;


/**
 *
 * @author Lado
 */
public class ControleurVisite {
    DB db = new DB();
    Visite visite = new Visite();
    
    public void ajouterMedecinDansVisite(int codeEmploye) throws SQLException{
        String specialite = db.getspecialteMedecin(codeEmploye, "specialite", "codeEmploye", "Medecin");
        visite.setMedecin(new Medecin(codeEmploye, specialite));
    }
    
    
    public void sauvegarderVisite() throws SQLException{
        
        int idVisite = db.getLastId("Visite", "idVisite") + 1;
        
        visite.setIdVisite(idVisite);
        visite.setDateVisite(DateVisite.dateDAujourdhui());
        ajouterMedecinDansVisite(Dossier.codeEmploye);
        
        db.sauvegarderVisite(visite);
    }

    public void ajouterNote(String note){
        visite.setNote(note);
    }
    
    public void ajouterEtablissement(String nomEtablissement){
        visite.setNomEtablissement(nomEtablissement);
    }
    
}
