/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjunit.services;

import ejerciciosjunit.entities.DateValidator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author luis_
 */
public class DateValidatorService {
    
    public DateValidatorService(){}
    
    public boolean dateIsValid(DateValidator dateValidator){
        boolean valid = false;
        try {
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");      
            //Parsing the given String to Date object
            Date date = formatter.parse(dateValidator.getDate());
            System.out.println(""+date.getYear());
            if(date.getYear() > 0){
                valid = true;
            }   
        } catch (ParseException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return valid;
    }
    
}
