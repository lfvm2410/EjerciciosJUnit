/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjunit.services;

import ejerciciosjunit.entities.PasswordValidator;

/**
 *
 * @author luis_
 */
public class PasswordValidatorService {

    public PasswordValidatorService() {
    }
    
    public boolean passwordIsValid(PasswordValidator passwordValidator){
        boolean valid = false;
        int upperCaseCounter = 0, specialCharacterCounter = 0;
        // Validate the lenght of the password
        if (passwordValidator.getPassword().length() >= 10){
            for (int i = 0; i < passwordValidator.getPassword().length(); i++) {
                // Validate if password has at least 1 upper case letter
                if (Character.isUpperCase(passwordValidator.getPassword().charAt(i))){
                    upperCaseCounter++;
                }
                // Validate if password has at least 1 special character
                if (!Character.isLetterOrDigit(passwordValidator.getPassword().charAt(i))){
                    specialCharacterCounter++;
                }
            }
            if (upperCaseCounter > 0 && specialCharacterCounter > 0){
                valid = true;
            }else{
                System.out.println("The password should contain at least 1 upper case letter and 1 special character!");
            }
        }else{
            System.out.println("The password must be of 10 characters at least!");
        }
        return valid;
    }
    
}
