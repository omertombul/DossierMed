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
public class Medecin extends Personnel{
    
    private int codeEmployeMedecin;
    private String specialite;
    
    public Medecin(int codeEmployeMedecin, String specialite){
        this.codeEmployeMedecin = codeEmployeMedecin;
        this.specialite = specialite;
    }
    

    public int getCodeEmployeMedecin() {
        return codeEmployeMedecin;
    }

    public void setCodeEmployeMedecin(int codeEmploye) {
        this.codeEmployeMedecin = codeEmploye;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }
    
    
    
    
}
