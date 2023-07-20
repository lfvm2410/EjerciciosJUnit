/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejerciciosjunit.entities.PasswordValidator;
import ejerciciosjunit.services.PasswordValidatorService;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author luis_
 */
public class PasswordValidatorTest {
    
    PasswordValidatorService passwordValidatorService;
    
    public PasswordValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        passwordValidatorService = new PasswordValidatorService();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void PasswordValidatorTest() {
        // Valid password
        assertTrue(passwordValidatorService.passwordIsValid(new PasswordValidator("Password!.")));
        // Invalid password, length issue
        assertFalse(passwordValidatorService.passwordIsValid(new PasswordValidator("Password!")));
        // Invalid password, upper case issue
        assertFalse(passwordValidatorService.passwordIsValid(new PasswordValidator("password!.")));
        // Invalid password, special character issue
        assertFalse(passwordValidatorService.passwordIsValid(new PasswordValidator("Passwordddd")));
    }
}
