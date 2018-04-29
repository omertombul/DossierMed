/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.affichage;

import com.inf600c.dossiermedical.application.ControleurDossier;
import com.inf600c.dossiermedical.domaine.Dossier;
import java.awt.List;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Lado
 */
public class FormulaireDossier extends javax.swing.JFrame {

    public FormulaireDossier instance; 
    ControleurDossier controleurDossier = new ControleurDossier();
    
    public FormulaireDossier() {
        initComponents();
        instance = this;
//        controleurDossier.creationDeTablesSysteme();

    }
      /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        entrerButton = new javax.swing.JButton();
        numAssMaladiejTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        visitesjLabel = new javax.swing.JLabel();
        listeVisitesjComboBox = new javax.swing.JComboBox<>();
        ouvrirAntecedentsjButton = new javax.swing.JButton();
        ajouterVisitejButton = new javax.swing.JButton();
        codeEmployejTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        entrerButton.setText("Entrer");
        entrerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entrerButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Numero Assurance Maladie Patient");

        jLabel2.setText("Code Employe");

        visitesjLabel.setText("Visites");
        visitesjLabel.setEnabled(false);

        listeVisitesjComboBox.setEnabled(false);
        listeVisitesjComboBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listeVisitesjComboBoxKeyPressed(evt);
            }
        });

        ouvrirAntecedentsjButton.setText("Ouvrir Antecedents");
        ouvrirAntecedentsjButton.setEnabled(false);

        ajouterVisitejButton.setText("ajouterVisite");
        ajouterVisitejButton.setEnabled(false);
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
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numAssMaladiejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(codeEmployejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(entrerButton)))
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ouvrirAntecedentsjButton)
                            .addComponent(visitesjLabel)
                            .addComponent(listeVisitesjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ajouterVisitejButton))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(visitesjLabel))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numAssMaladiejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listeVisitesjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ouvrirAntecedentsjButton)
                    .addComponent(codeEmployejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ajouterVisitejButton)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(entrerButton)
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entrerButtonActionPerformed
        
        String textNumAssMaladie = numAssMaladiejTextField.getText().equals(null) ? "" : numAssMaladiejTextField.getText();
        String textIDProfessionnel = codeEmployejTextField.getText().equals(null) ? "" : codeEmployejTextField.getText();
        
        if(textNumAssMaladie.equals("") || textIDProfessionnel.equals("")){
            
            JOptionPane.showMessageDialog(null, 
                              "Les champs ID Professionnel et Numéro d'Assurance Maladie doivent etre rempli!", 
                              "WARNING", 
                              JOptionPane.WARNING_MESSAGE);
        }else{
            
            Dossier.numAssMaladie = Integer.parseInt(textNumAssMaladie);
            Dossier.codeEmploye = Integer.parseInt(textIDProfessionnel);
            boolean accesValide = false;
            
            try {
               accesValide = Dossier.validerDossier();
            } catch (SQLException ex) {
                Logger.getLogger(FormulaireDossier.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (accesValide){    
                remplirListeVisites();
                //activer la presentation de la liste de visites et activer le bouton Ouvrir Antecedents
                ouvrirAntecedentsjButton.setEnabled(rootPaneCheckingEnabled);
                listeVisitesjComboBox.setEnabled(rootPaneCheckingEnabled);
                visitesjLabel.setEnabled(rootPaneCheckingEnabled);
                ajouterVisitejButton.setEnabled(rootPaneCheckingEnabled);
            }
        }
    
    }//GEN-LAST:event_entrerButtonActionPerformed

    private void ajouterVisitejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ajouterVisitejButtonActionPerformed
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FormulaireVisite().setVisible(true);
                    //    instance.dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(FormulaireDossier.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    }//GEN-LAST:event_ajouterVisitejButtonActionPerformed

    private void remplirListeVisites(){
        ArrayList listeVisites = controleurDossier.trouverVisitesPatient();
        
        listeVisites.forEach(item->listeVisitesjComboBox.addItem((String)item));
 //       listeVisitesjComboBox.addActionListener(listeVisitesjComboBox);
    
    }
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        listeVisitesjComboBox.removeAllItems();
    }//GEN-LAST:event_formWindowClosing

    private void listeVisitesjComboBoxKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listeVisitesjComboBoxKeyPressed
        AffichageVisite affichageVisite = new AffichageVisite();
         
        String dateVisite = listeVisitesjComboBox.getSelectedItem().toString();
        
        ArrayList listAttributsVisite = controleurDossier.trouverAttributesVisite(Dossier.numAssMaladie, dateVisite);
                
        DefaultTableModel model = (DefaultTableModel) affichageVisite.affichageVisitejTable.getModel();
        model.addRow(new Object[]{Dossier.numAssMaladie, listAttributsVisite.get(0), listAttributsVisite.get(1), listAttributsVisite.get(2),listAttributsVisite.get(3),listAttributsVisite.get(4),listAttributsVisite.get(5),listAttributsVisite.get(6)});
        
        affichageVisite.setVisible(true);
    }//GEN-LAST:event_listeVisitesjComboBoxKeyPressed
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterVisitejButton;
    private javax.swing.JTextField codeEmployejTextField;
    private javax.swing.JButton entrerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JComboBox<String> listeVisitesjComboBox;
    private javax.swing.JTextField numAssMaladiejTextField;
    private javax.swing.JButton ouvrirAntecedentsjButton;
    private javax.swing.JLabel visitesjLabel;
    // End of variables declaration//GEN-END:variables
}
