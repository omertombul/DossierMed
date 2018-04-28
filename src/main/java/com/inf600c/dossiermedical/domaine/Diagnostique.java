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
public class Diagnostique {
    
    private int idDiagnostique;
    private String diagnostique;

    public int getIdDiagnostique() {
        return idDiagnostique;
    }

    public void setIdDiagnostique(int idDiagnostique) {
        this.idDiagnostique = idDiagnostique;
    }

    public String getDiagnostique() {
        return diagnostique;
    }

    public void setDiagnostique(String diagnostique) {
        this.diagnostique = diagnostique;
    }
}
