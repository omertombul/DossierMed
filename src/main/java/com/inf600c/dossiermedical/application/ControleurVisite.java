/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.application;

import com.inf600c.dossiermedical.domaine.Diagnostique;
import com.inf600c.dossiermedical.domaine.Dossier;
import com.inf600c.dossiermedical.domaine.Medecin;
import com.inf600c.dossiermedical.domaine.Patient;
import com.inf600c.dossiermedical.domaine.Visite;
import com.inf600c.dossiermedical.domaine.Visite.Builder;
import com.inf600c.dossiermedical.servicestechniques.DB;
import com.inf600c.dossiermedical.servicestechniques.DateVisite;
import java.text.ParseException;


/**
 *
 * @author Lado
 */
public class ControleurVisite {
    
    DB db = new DB();
    Builder builderVisite = new Visite.Builder();
    Diagnostique diagnostique = new Diagnostique();
    
    public void setIdVisite(){
        int idVisite;
            db.creerTableVisite();
            idVisite = db.getLastId("Visite", "idVisite") + 1;
            builderVisite.setIdVisite(idVisite);
            db.creerVisite(idVisite);
        
    }
    
    public void ajouterMedecinDansVisite(int codeEmploye){
        String specialite = db.getspecialteMedecin(codeEmploye, "specialite", "codeEmploye", "Medecin");
        builderVisite.setMedecin(new Medecin(codeEmploye, specialite));
    }
    
    public void ajouterPatientDansVisite(int numAssMaladie) throws ParseException{
        Patient patient = db.getParametresPatient(numAssMaladie);
        builderVisite.setPatient(patient);
    }
    
    public void ajouterDiagnostique(String textDiagnostique) throws ParseException{
        diagnostique.setDiagnostique(textDiagnostique);
        db.creerDiagnostique(builderVisite.getIdVisite(), textDiagnostique);
        builderVisite.setDiagnostique(diagnostique);
    }
    
    public void sauvegarderVisite() throws ParseException{
        
        builderVisite.setDateVisite(DateVisite.dateDAujourdhui());
        ajouterMedecinDansVisite(Dossier.codeEmploye);
        ajouterPatientDansVisite(Dossier.numAssMaladie);
        
        Visite visite = builderVisite.construireVisite();
        
        db.sauvegarderVisite(visite);
    }

    public void ajouterNote(String note){
        builderVisite.setNote(note);
    }
    
    public void ajouterEtablissement(String nomEtablissement){
        builderVisite.setNomEtablissement(nomEtablissement);
    }
    
    public boolean validerChamps(){
        
        if(builderVisite.getDiagnostique().equals("") && builderVisite.getNote().equals("") && builderVisite.getNomEtablissement().equals(""))
            return false;
        
        return true;
    }
    
}
