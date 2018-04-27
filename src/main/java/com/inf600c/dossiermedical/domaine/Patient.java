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
public class Patient {
    
    private int numAssMaladie;
    private String dateNaissance;
    private int genre;
    private String villeNaissance;
    private String parent1;
    private String parent2;
    
    public Patient(){}
    
    public Patient(int numAssMaladie, String dateNaissance, int genre, String villeNaissance, String parent1, String parent2){
        this.numAssMaladie = numAssMaladie;
        this.dateNaissance = dateNaissance;
        this.genre = genre;
        this.villeNaissance = villeNaissance;
        this.parent1 = parent1;
        this.parent2 = parent2;
        
    }

    public int getNumAssMaladie() {
        return numAssMaladie;
    }

    public void setNumAssMaladie(int numAssMaladie) {
        this.numAssMaladie = numAssMaladie;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public int getGenre() {
        return genre;
    }

    public void setGenre(int genre) {
        this.genre = genre;
    }

    public String getVilleNaissance() {
        return villeNaissance;
    }

    public void setVilleNaissance(String villeNaissance) {
        this.villeNaissance = villeNaissance;
    }

    public String getParent1() {
        return parent1;
    }

    public void setParent1(String parent1) {
        this.parent1 = parent1;
    }

    public String getParent2() {
        return parent2;
    }

    public void setParent2(String parent2) {
        this.parent2 = parent2;
    }
    
}
