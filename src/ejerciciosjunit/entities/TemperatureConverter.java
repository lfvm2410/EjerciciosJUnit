package ejerciciosjunit.entities;

import com.sun.media.sound.InvalidFormatException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luis_
 */
public class TemperatureConverter {
    
    private double grades;

    public TemperatureConverter(double grades) {
        this.grades = grades;
    }

    public double getGrades() {
        return grades;
    }

    public void setGrades(double grades) {
        this.grades = grades;
    }
}
