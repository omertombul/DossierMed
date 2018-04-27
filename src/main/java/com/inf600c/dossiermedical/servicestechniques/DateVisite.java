/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.servicestechniques;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author omeee
 */
public class DateVisite {

    public static Date dateDAujourdhui(){
        
        SimpleDateFormat dayFormatter = new SimpleDateFormat("dd-MM-yyyy");
        
        return new Date();
    }
    
}
