/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjunit.services;

import ejerciciosjunit.entities.TemperatureConverter;

/**
 *
 * @author luis_
 */
public class TemperatureConverterService {
    
    public TemperatureConverterService(){}
    
    public double convertCelsiusToKelvin(TemperatureConverter temperatureConverter){
        double conversion = temperatureConverter.getGrades() + 273.15;
        return conversion;
    }
    
    public double convertCelsiusToFarenheit(TemperatureConverter temperatureConverter){
        double conversion = (temperatureConverter.getGrades() * 1.8) + 32;
        return conversion;
    }
    
    public double convertKelvinToCelsius(TemperatureConverter temperatureConverter){
        double conversion = temperatureConverter.getGrades() - 273.15;
        return conversion;
    }
    
    public double convertKelvinToFarenheit(TemperatureConverter temperatureConverter){
        double conversion = ((temperatureConverter.getGrades() - 273.15) * 1.8) + 32;
        return conversion;
    }
    
    public double convertFarenheitToCelsius(TemperatureConverter temperatureConverter){
        double conversion = ((temperatureConverter.getGrades() - 32) / 1.8);
        return conversion;
    }
    
    public double convertFarenheitToKelvin(TemperatureConverter temperatureConverter){
        double conversion = ((temperatureConverter.getGrades() - 32) / 1.8) + 273.15;
        return conversion;
    }
}
