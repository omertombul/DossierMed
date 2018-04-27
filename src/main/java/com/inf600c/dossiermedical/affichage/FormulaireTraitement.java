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
    public FormulaireTraitement() throws SQLException {
        initComponents();
        controleurTraitement.setIdTraitement();
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
        jCheckBoxHospitalisation = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextFieldMedicament = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextFieldProcedure = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setText("Medicament");

        jLabel2.setText("Procedure");

        jCheckBoxHospitalisation.setText("checkBoxHospitalisation");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                        .addComponent(jCheckBoxHospitalisation))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
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
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jLabel2.getAccessibleContext().setAccessibleName("labelProcedure");
        jLabel2.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleName("labelMedicament");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Boolean hospitalisation = false;
    
    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        try {
            ajouterTraitement();
        } catch (SQLException ex) {
            Logger.getLogger(FormulaireTraitement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosed

    private void ajouterTraitement() throws SQLException{
        int hospiatlisation = 0;
        
        if(jCheckBoxHospitalisation.isSelected())
            hospiatlisation = 1;
       
        String procedure = jTextFieldProcedure.getText() == null ? "" : jTextFieldProcedure.getText();
        
        String medicament = jTextFieldMedicament.getText() == null ? "" : jTextFieldMedicament.getText();
        
        controleurTraitement.sauvegarderTraitement(medicament, procedure, hospiatlisation);
    }
    
    /**
     * @param args the command line arguments
     */
     //  test      

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBoxHospitalisation;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextFieldMedicament;
    private javax.swing.JTextArea jTextFieldProcedure;
    // End of variables declaration//GEN-END:variables
}
