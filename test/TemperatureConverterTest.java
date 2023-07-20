/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import ejerciciosjunit.entities.TemperatureConverter;
import ejerciciosjunit.services.TemperatureConverterService;
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
public class TemperatureConverterTest {
    
    private TemperatureConverterService temperatureConverterService;
    
    public TemperatureConverterTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        temperatureConverterService = new TemperatureConverterService();
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void TemperatureConverterTest() {
        // Convert Celsius to Kelvin test
        assertEquals(323.15, temperatureConverterService.convertCelsiusToKelvin(new TemperatureConverter(50)), 0);
        // Convert Celsius to Farenheit test
        assertEquals(95, temperatureConverterService.convertCelsiusToFarenheit(new TemperatureConverter(35)), 0);
        // Convert Kelvin to Celsius
        assertEquals(-263.15, temperatureConverterService.convertKelvinToCelsius(new TemperatureConverter(10)), 0);
        // Convert Kelvin to Farenheit
        assertEquals(-441.66999999999996, temperatureConverterService.convertKelvinToFarenheit(new TemperatureConverter(10)), 0);
        // Convert Farenheit to Celsius
        assertEquals(10, temperatureConverterService.convertFarenheitToCelsius(new TemperatureConverter(50)), 0);
        // Convert Farenheit to Kelvin
        assertEquals(283.1500, temperatureConverterService.convertFarenheitToKelvin(new TemperatureConverter(50)), 0);
    }
}
