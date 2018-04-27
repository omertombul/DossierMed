/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.inf600c.dossiermedical.servicestechniques;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author omeee
 */
public class DateVisite {

    public static String dateDAujourdhui(){
        
        SimpleDateFormat dayFormatter = new SimpleDateFormat("dd-MM-yyyy");
        
        Date newDate = new Date();
        
        return dayFormatter.format(newDate);
    }
    
 //   public static Date convertStringToDate(String stringDate) throws ParseException{
 //       return new SimpleDateFormat("dd-MM-yyyy").parse(stringDate); 
 //   }
    
}
