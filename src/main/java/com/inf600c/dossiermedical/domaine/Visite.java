/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.domaine;

/** 
 * 
 * Example de code de Jacques Berger était utilisé lors de la création de cette classe
 * https://github.com/jacquesberger/exemplesINF5153/blob/master/GoF/Builder/src/main/java/org/jberger/patterns/builder/builder/Person.java
 */
public class Visite {
    
    private final int numAssMaladie;
    private final int idVisite;
    private final Medecin medecin;
    private final Patient patient;
    private final String nomEtablissement;
    private final String note;
    private final Diagnostique diagnostique;
    private final String dateVisite;
    
    private Visite(Builder builder) {
        this.numAssMaladie = builder.numAssMaladie;
        this.idVisite = builder.idVisite;
        this.medecin = builder.medecin;
        this.patient = builder.patient;
        this.nomEtablissement = builder.nomEtablissement;
        this.note = builder.note;
        this.diagnostique = builder.diagnostique;
        this.dateVisite = builder.dateVisite;
    }
    
    public static class Builder{
        
        private int numAssMaladie;
        private int idVisite;
        private Medecin medecin;
        private Patient patient;
        private String nomEtablissement;
        private String note;
        private Diagnostique diagnostique;
        private String dateVisite;
        
        public Builder() {}

        public int getNumAssMaladie() {
            return numAssMaladie;
        }

        public void setNumAssMaladie(int numAssMaladie) {
            this.numAssMaladie = numAssMaladie;
        }

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

        public String getNote() {
            return note;
        }

        public void setNote(String note) {
            this.note = note;
        }

        public Diagnostique getDiagnostique() {
            return diagnostique;
        }

        public void setDiagnostique(Diagnostique diagnostique) {
            this.diagnostique = diagnostique;
        }

        public String getDateVisite() {
            return dateVisite;
        }

        public void setDateVisite(String dateVisite) {
            this.dateVisite = dateVisite;
        }
        
        public Visite construireVisite() {
            return new Visite(this);
        }
    } //Builder
    
    public int getIdVisite() {
        return idVisite;
    }

    public Medecin getMedecin() {
        return medecin;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getNomEtablissement() {
        return nomEtablissement;
    }

    public String getDateVisite() {
        return dateVisite;
    }


    public int getNumAssMaladie() {
        return numAssMaladie;
    }

    public String getNote() {
        return note;
    }

    public Diagnostique getDiagnostique() {
        return diagnostique;
    }
   
}
