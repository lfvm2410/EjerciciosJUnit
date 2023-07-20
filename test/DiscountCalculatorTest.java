/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejerciciosjunit.entities.DiscountCalculator;
import ejerciciosjunit.services.DiscountCalculatorService;
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
public class DiscountCalculatorTest {
    
    DiscountCalculatorService discountCalculatorService;
    
    public DiscountCalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        discountCalculatorService = new DiscountCalculatorService();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void DiscountCalculatorTest() {
        // 10% discount
        assertEquals(10, discountCalculatorService.calculateDiscount(new DiscountCalculator(100, 10, 30)), 0);
        // Max discount
        assertEquals(30, discountCalculatorService.calculateDiscount(new DiscountCalculator(100, 60, 30)), 0);
        // 0% discount
        assertEquals(0, discountCalculatorService.calculateDiscount(new DiscountCalculator(100, 0, 30)), 0);
        //
    }
}
