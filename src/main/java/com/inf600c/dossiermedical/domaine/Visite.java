/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.domaine;
import java.util.Date;

/**
 *
 * @author Lado
 */
public class Visite {
    
    private int numAssSociale;
    private int idVisite;
    private Medecin medecin;
    private Patient patient;
    private String nomEtablissement;
    private Date dateVisite;

    public int getIdVisite() {
        return idVisite;
    }

    public void setIdVisite(int idVisite) {
        this.idVisite = idVisite;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public void setMedecin(Medecin medecin) {
        this.medecin = medecin;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public String getNomEtablissement() {
        return nomEtablissement;
    }

    public void setNomEtablissement(String nomEtablissement) {
        this.nomEtablissement = nomEtablissement;
    }

    public Date getDateVisite() {
        return dateVisite;
    }

    public void setDateVisite(Date dateVisite) {
        this.dateVisite = dateVisite;
    }

    public int getNumAssSociale() {
        return numAssSociale;
    }

    public void setNumAssSociale(int numAssSociale) {
        this.numAssSociale = numAssSociale;
    }
    
    
    
    
    
}
