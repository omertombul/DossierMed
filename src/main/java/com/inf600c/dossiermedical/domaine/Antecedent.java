/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.domaine;

import java.sql.Date;

/**
 *
 * @author Lado
 */
public class Antecedent implements Command {
    
    private String descriptionDiagnostique;
    private String oldDescriptionDiagnostique;
    private String newDescriptionDiagnostique;
    private String descriptionTraitement;
    private String oldDescriptionTraitement;
    private String newDescriptionTraitement;
    private Medecin medecin;
    private Date dateDebutTraitement;
    private Date dateFinTraitement;
    private boolean estExecutee = false;
    
    
    public Antecedent(){
    }
    
    public Antecedent(String nouveauDiagnostique, String nouveauTraitement){
       
        this.descriptionDiagnostique = nouveauDiagnostique;
        newDescriptionDiagnostique = nouveauDiagnostique;
        this.descriptionTraitement = nouveauTraitement;
        newDescriptionTraitement = nouveauTraitement;
    }
            
    public String getDescriptionDiagnostique() {
        return descriptionDiagnostique;
    }

    public void setDescriptionDiagnostique(String descriptionDiagnostique) {
        this.descriptionDiagnostique = descriptionDiagnostique;
    }

    public String getDescriptionTraitement() {
        return descriptionTraitement;
    }

    public void setDescriptionTraitement(String descriptionTraitement) {
        this.descriptionTraitement = descriptionTraitement;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Date getDateDebutTraitement() {
        return dateDebutTraitement;
    }

    public void setDateDebutTraitement(Date dateDebutTraitement) {
        this.dateDebutTraitement = dateDebutTraitement;
    }

    public Date getDateFinTraitement() {
        return dateFinTraitement;
    }

    public void setDateFinTraitement(Date dateFinTraitement) {
        this.dateFinTraitement = dateFinTraitement;
    }

   
    @Override
    public void executerCommand() {
        oldDescriptionDiagnostique = getDescriptionDiagnostique();
        setDescriptionDiagnostique(newDescriptionDiagnostique);
        oldDescriptionTraitement = getDescriptionTraitement();
        setDescriptionTraitement(newDescriptionTraitement);
        
        estExecutee = true;
        
    }

    @Override
    public void annulerCommande() {
        if(estExecutee){           
            setDescriptionDiagnostique(oldDescriptionDiagnostique);
            setDescriptionTraitement(oldDescriptionTraitement);
        }
    }
    
}
