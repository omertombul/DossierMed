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
        noteLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ajouterVisitejButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        diagnostiquejTextField = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        etablissementjTextField = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        notejTextField = new javax.swing.JTextArea();

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

        diagnostiquejTextField.setColumns(20);
        diagnostiquejTextField.setRows(5);
        jScrollPane1.setViewportView(diagnostiquejTextField);

        etablissementjTextField.setColumns(20);
        etablissementjTextField.setRows(5);
        jScrollPane2.setViewportView(etablissementjTextField);

        notejTextField.setColumns(20);
        notejTextField.setRows(5);
        jScrollPane3.setViewportView(notejTextField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noteLabel, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 513, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ajouterVisitejButton, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ajouterTraitementButton, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(67, 67, 67))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ajouterTraitementButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noteLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ajouterVisitejButton)
                        .addGap(47, 47, 47))))
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
    private javax.swing.JTextArea diagnostiquejTextField;
    private javax.swing.JTextArea etablissementjTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JTextArea notejTextField;
    // End of variables declaration//GEN-END:variables
}
