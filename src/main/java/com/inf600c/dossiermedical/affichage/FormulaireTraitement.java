/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.affichage;

import com.inf600c.dossiermedical.domaine.Traitement;
import com.inf600c.dossiermedical.application.DB;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lado
 */
public class FormulaireTraitement extends javax.swing.JFrame {

    Traitement traitement;
    DB db;
    /**
     * Creates new form FormulaireTraitement
     */
    public FormulaireTraitement() {
        initComponents();
        
        traitement = new Traitement();
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

        jTextFieldProcedure = new javax.swing.JTextField();
        jTextFieldMedicament = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonSomettre = new javax.swing.JButton();
        jCheckBoxHospitalisation = new javax.swing.JCheckBox();

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jTextFieldMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldProcedure, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBoxHospitalisation))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonSomettre)
                        .addGap(0, 301, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldProcedure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldMedicament, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBoxHospitalisation))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jButtonSomettre)
                .addGap(22, 22, 22))
        );

        jTextFieldProcedure.getAccessibleContext().setAccessibleName("textFieldProcedure");
        jTextFieldMedicament.getAccessibleContext().setAccessibleName("textFieldMedicament");
        jLabel2.getAccessibleContext().setAccessibleName("labelProcedure");
        jLabel2.getAccessibleContext().setAccessibleDescription("");
        jButtonSomettre.getAccessibleContext().setAccessibleName("soumettreButton");

        getAccessibleContext().setAccessibleName("labelMedicament");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Boolean hospitalisation = false;
    
    private void jButtonSomettreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSomettreActionPerformed
        ajouterTraitement();
        try {
            db.sauvegarderTraitement(traitement);
        } catch (SQLException ex) {
            Logger.getLogger(FormulaireTraitement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonSomettreActionPerformed

    private void ajouterTraitement(){
        if(jCheckBoxHospitalisation.isSelected())
            traitement.setHospitalisation(1);
       
        String procedure = jTextFieldProcedure.getText() == null ? "" : jTextFieldProcedure.getText();
        if(procedure != "")
            traitement.setProcedure(procedure);
        
        String medicament = jTextFieldMedicament.getText() == null ? "" : jTextFieldMedicament.getText();
        if(medicament != "")
            traitement.setMedicament(medicament);
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
    private javax.swing.JTextField jTextFieldMedicament;
    private javax.swing.JTextField jTextFieldProcedure;
    // End of variables declaration//GEN-END:variables
}
