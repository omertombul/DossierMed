/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.affichage;

import com.inf600c.dossiermedical.servicestechniques.DB;
import com.inf600c.dossiermedical.domaine.Visite;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lado
 */
public class FormulaireVisite extends javax.swing.JFrame {
    
    Visite visite = new Visite();
    DB db = new DB();

    /**
     * Creates new form Visite
     */
    public FormulaireVisite() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ajouterTraitementButton = new javax.swing.JButton();
        notejTextField = new javax.swing.JTextField();
        noteLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        diagnostiquejTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        etablissementjTextField = new javax.swing.JTextField();
        ajouterVisitejButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        ajouterTraitementButton.setText("Traitement");
        ajouterTraitementButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterTraitementButtonActionPerformed(evt);
            }
        });

        noteLabel.setText("Note");

        jLabel1.setText("Diagnostique");

        jLabel2.setText("Etablissement");

        ajouterVisitejButton.setText("Ajouter");
        ajouterVisitejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterVisitejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etablissementjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(294, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(noteLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(diagnostiquejTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE)
                                    .addComponent(notejTextField))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ajouterVisitejButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ajouterTraitementButton, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGap(34, 34, 34))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(ajouterTraitementButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(diagnostiquejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(ajouterVisitejButton))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etablissementjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(noteLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(notejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ajouterTraitementButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterTraitementButtonActionPerformed
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormulaireTraitement().setVisible(true);
            }
        });
    }//GEN-LAST:event_ajouterTraitementButtonActionPerformed

    private void ajouterVisitejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterVisitejButtonActionPerformed
        try {
            db.sauvegarderVisite(visite);
        } catch (SQLException ex) {
            Logger.getLogger(FormulaireTraitement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ajouterVisitejButtonActionPerformed

    private void ajouterVisite(){
        String note = notejTextField.getText() == null ? "" : notejTextField.getText();
        if(note != "")
            visite.setNote(note);
        
        String nomEtablissement = etablissementjTextField.getText() == null ? "" : etablissementjTextField.getText();
        if(nomEtablissement != "")
            visite.setNomEtablissement(nomEtablissement);
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterTraitementButton;
    private javax.swing.JButton ajouterVisitejButton;
    private javax.swing.JTextField diagnostiquejTextField;
    private javax.swing.JTextField etablissementjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JTextField notejTextField;
    // End of variables declaration//GEN-END:variables
}
