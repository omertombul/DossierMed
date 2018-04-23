/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.domaine;

import com.inf600c.dossiermedical.application.DB;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author vxk09291
 */
public class Dossier {
    
    static DB db;
    
    public static int numAssMaladie;
    public static int codeEmploye;
    
    public static boolean validerDossier() throws SQLException{
        db = new DB();
        boolean numAssMaladieExiste = db.validerIfExiste(numAssMaladie, "numAssMaladie", "Patient");
        boolean codeEmployeExiste = db.validerIfExiste(Dossier.codeEmploye, "codeEmploye", "Personnel");
        
        if(!numAssMaladieExiste ){
            
            JOptionPane.showMessageDialog(null, 
                              "Numéro d'Assurance Maladie n'existe pas!", 
                              "WARNING", 
                              JOptionPane.WARNING_MESSAGE);
            return false;
        }
            
        
        if(!codeEmployeExiste){
            JOptionPane.showMessageDialog(null, 
                              "Code Employe n'existe pas!", 
                              "WARNING", 
                              JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
        return true;
    }
    
    
}
