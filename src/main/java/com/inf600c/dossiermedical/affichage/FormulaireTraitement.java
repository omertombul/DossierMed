/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.affichage;

import com.inf600c.dossiermedical.application.ControleurTraitement;
import com.inf600c.dossiermedical.domaine.Traitement;
import com.inf600c.dossiermedical.servicestechniques.DB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lado
 */
public class FormulaireTraitement extends javax.swing.JFrame {

//    Traitement traitement;
    DB db;
    ControleurTraitement controleurTraitement = new ControleurTraitement(); 
    /**
     * Creates new form FormulaireTraitement
     */
    public FormulaireTraitement() {
        initComponents();
        
//        traitement = new Traitement();
        db = new DB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonSomettre = new javax.swing.JButton();
        jCheckBoxHospitalisation = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextFieldMedicament = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextFieldProcedure = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Medicament");

        jLabel2.setText("Procedure");

        jButtonSomettre.setText("Soumettre");
        jButtonSomettre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSomettreActionPerformed(evt);
            }
        });

        jCheckBoxHospitalisation.setText("checkBoxHospitalisation");
        jCheckBoxHospitalisation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxHospitalisationActionPerformed(evt);
            }
        });

        jTextFieldMedicament.setColumns(20);
        jTextFieldMedicament.setRows(5);
        jScrollPane1.setViewportView(jTextFieldMedicament);

        jTextFieldProcedure.setColumns(20);
        jTextFieldProcedure.setRows(5);
        jScrollPane2.setViewportView(jTextFieldProcedure);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 96, Short.MAX_VALUE)
                        .addComponent(jCheckBoxHospitalisation))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSomettre)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBoxHospitalisation)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButtonSomettre))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );

        jLabel2.getAccessibleContext().setAccessibleName("labelProcedure");
        jLabel2.getAccessibleContext().setAccessibleDescription("");
        jButtonSomettre.getAccessibleContext().setAccessibleName("soumettreButton");

        getAccessibleContext().setAccessibleName("labelMedicament");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Boolean hospitalisation = false;
    
    private void jButtonSomettreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomettreActionPerformed
        try {
            ajouterTraitement();
        } catch (SQLException ex) {
            Logger.getLogger(FormulaireTraitement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSomettreActionPerformed

    private void jCheckBoxHospitalisationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxHospitalisationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxHospitalisationActionPerformed

    private void ajouterTraitement() throws SQLException{
        int hospiatlisation = 0;
        
        if(jCheckBoxHospitalisation.isSelected())
            hospiatlisation = 1;
//            traitement.setHospitalisation(1);
       
        String procedure = jTextFieldProcedure.getText() == null ? "" : jTextFieldProcedure.getText();
//        if(!procedure.equals(""))
//            traitement.setProcedure(procedure);
        
        String medicament = jTextFieldMedicament.getText() == null ? "" : jTextFieldMedicament.getText();
//        if(!medicament.equals(""))
//            traitement.setMedicament(medicament);
        
        controleurTraitement.sauvegarderTraitement(medicament, procedure, hospiatlisation);
    }
    
    /**
     * @param args the command line arguments
     */
     //  test      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSomettre;
    private javax.swing.JCheckBox jCheckBoxHospitalisation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextFieldMedicament;
    private javax.swing.JTextArea jTextFieldProcedure;
    // End of variables declaration//GEN-END:variables
}
