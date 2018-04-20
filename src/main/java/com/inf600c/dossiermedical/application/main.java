/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.application;

import com.inf600c.dossiermedical.affichage.Dossier;
import com.inf600c.dossiermedical.affichage.FormulaireTraitement;
import java.sql.*;


/**
 *
 * @author Lado
 */
public class main {
    
    public static Connection conn;
    
    public static void main(String args[]) throws SQLException {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dossier().setVisible(true);
            }
        });
        
        
    }    
   
}
