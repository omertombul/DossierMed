/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.affichage;

import com.inf600c.dossiermedical.servicestechniques.DB;
import com.inf600c.dossiermedical.domaine.Dossier;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Lado
 */
public class FormulaireDossier extends javax.swing.JFrame {

    DB db;
    
    public FormulaireDossier() {
        initComponents();
        
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

        entrerButton = new javax.swing.JButton();
        numAssMaladiejTextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        visitesjLabel = new javax.swing.JLabel();
        listeVisitesjComboBox = new javax.swing.JComboBox<>();
        ouvrirAntecedentsjButton = new javax.swing.JButton();
        ajouterVisitejButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        codeEmployejTextField = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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

        listeVisitesjComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listeVisitesjComboBox.setEnabled(false);

        ouvrirAntecedentsjButton.setText("Ouvrir Antecedents");
        ouvrirAntecedentsjButton.setEnabled(false);

        ajouterVisitejButton.setText("ajouterVisite");
        ajouterVisitejButton.setEnabled(false);
        ajouterVisitejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ajouterVisitejButtonActionPerformed(evt);
            }
        });

        codeEmployejTextField.setColumns(20);
        codeEmployejTextField.setRows(5);
        jScrollPane1.setViewportView(codeEmployejTextField);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ajouterVisitejButton)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(numAssMaladiejTextField)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addComponent(entrerButton))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ouvrirAntecedentsjButton)
                            .addComponent(visitesjLabel)
                            .addComponent(listeVisitesjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(150, Short.MAX_VALUE))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ouvrirAntecedentsjButton)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entrerButton)
                    .addComponent(ajouterVisitejButton))
                .addContainerGap())
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
                new FormulaireVisite().setVisible(true);
                
            }
        });
    }//GEN-LAST:event_ajouterVisitejButtonActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ajouterVisitejButton;
    private javax.swing.JTextArea codeEmployejTextField;
    private javax.swing.JButton entrerButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> listeVisitesjComboBox;
    private javax.swing.JTextField numAssMaladiejTextField;
    private javax.swing.JButton ouvrirAntecedentsjButton;
    private javax.swing.JLabel visitesjLabel;
    // End of variables declaration//GEN-END:variables
}
