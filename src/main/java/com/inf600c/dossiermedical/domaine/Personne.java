/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.domaine;

import java.sql.Date;

/**
 *
 * @author omeee
 */
public class Personne {
    
    private String nom;
    private String prenom;
    private Date dateNaissanse;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateNaissanse() {
        return dateNaissanse;
    }

    public void setDateNaissanse(Date dateNaissanse) {
        this.dateNaissanse = dateNaissanse;
    }
    
    
    
}
