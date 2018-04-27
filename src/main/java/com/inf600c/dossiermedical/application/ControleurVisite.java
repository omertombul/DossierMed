/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.application;

import com.inf600c.dossiermedical.domaine.Dossier;
import com.inf600c.dossiermedical.domaine.Medecin;
import com.inf600c.dossiermedical.domaine.Patient;
import com.inf600c.dossiermedical.domaine.Visite;
import com.inf600c.dossiermedical.servicestechniques.DB;
import com.inf600c.dossiermedical.servicestechniques.DateVisite;
import java.awt.List;
import java.sql.SQLException;
import java.text.ParseException;


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
    
    public void ajouterPatientDansVisite(int numAssMaladie) throws SQLException, ParseException{
        Patient patient = db.getParametresPatient(numAssMaladie);
        visite.setPatient(patient);
    }
    
    
    public void sauvegarderVisite() throws SQLException, ParseException{
        
        int idVisite = db.getLastId("Visite", "idVisite") + 1;
        
        visite.setIdVisite(idVisite);
        visite.setDateVisite(DateVisite.dateDAujourdhui());
        ajouterMedecinDansVisite(Dossier.codeEmploye);
        ajouterPatientDansVisite(Dossier.numAssMaladie);
        
        db.sauvegarderVisite(visite);
    }

    public void ajouterNote(String note){
        visite.setNote(note);
    }
    
    public void ajouterEtablissement(String nomEtablissement){
        visite.setNomEtablissement(nomEtablissement);
    }
    
}
