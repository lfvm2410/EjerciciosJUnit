/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejerciciosjunit.entities.DateValidator;
import ejerciciosjunit.services.DateValidatorService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class DateValidatorTest {
    
    private DateValidatorService dateValidatorService;
    
    public DateValidatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        dateValidatorService = new DateValidatorService();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void DateValidatorTest() {
        // Validate date according to Gregorian Calendar
        assertTrue(dateValidatorService.dateIsValid(new DateValidator("26-09-1989")));
        assertFalse(dateValidatorService.dateIsValid(new DateValidator("26-09-1900")));
    }
}
