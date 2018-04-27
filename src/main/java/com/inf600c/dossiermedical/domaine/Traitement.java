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

    private final int idTraitement;
    private final String medicament;
    private final String procedure;
    private final int hospitalisation;
    
    public static class Builder {
        
        private int idTraitement;
        private String medicament;
        private String procedure;
        private int hospitalisation = 0;
        
        public Builder() {}


        public int getIdTraitement() {
            return idTraitement;
        }

        public void setIdTraitement(int idTraitement) {
            this.idTraitement = idTraitement;
        }

        
        public String getMedicament() {
            return medicament;
        }

        public void setMedicament(String medicament) {
            this.medicament = medicament;
        }

        public String getProcedure() {
            return procedure;
        }

        public void setProcedure(String procedure) {
            this.procedure = procedure;
        }

        public Integer getHospitalisation() {
            return hospitalisation;
        }

        public void setHospitalisation(Integer hospitalisation) {
            this.hospitalisation = hospitalisation;
        }
    
        public Traitement construireTraitement() {
            return new Traitement(this);
        }
    }
  
    private Traitement(Builder builder) {
        this.idTraitement = builder.idTraitement;
        this.medicament = builder.medicament;
        this.procedure = builder.procedure;
        this.hospitalisation = builder.hospitalisation;
    }
    
    public String getMedicament() {
        return medicament;
    }

    public String getProcedure() {
        return procedure;
    }

    public int getHospitalisation() {
        return hospitalisation;
    }


    public int getIdTraitement() {
        return idTraitement;
    }

    
    
    
    
    
    
}
