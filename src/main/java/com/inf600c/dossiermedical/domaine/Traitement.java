/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.domaine;

/**
 *
 * @author Lado
 */
public class Traitement {

    private int idTraitement;
    private String descriptionTraitement;
    private String medicament;
    private String procedure;
    Integer hospitalisation = 0;
  
    
    
    public void setMedicament(String medicament) {
        this.medicament = medicament;
    }

    public void setProcedure(String procedure) {
        this.procedure = procedure;
    }

    public void setHospitalisation(Integer hospitalisation) {
        this.hospitalisation = hospitalisation;
    }

    public String getMedicament() {
        return medicament;
    }

    public String getProcedure() {
        return procedure;
    }

    public Integer getHospitalisation() {
        return hospitalisation;
    }

    public String getDescriptionTraitement() {
        return descriptionTraitement;
    }

    public void setDescriptionTraitement(String descriptionTraitement) {
        this.descriptionTraitement = descriptionTraitement;
    }

    public int getIdTraitement() {
        return idTraitement;
    }

    public void setIdTraitement(int idTraitement) {
        this.idTraitement = idTraitement;
    }
    
    
    
    
    
    
}
