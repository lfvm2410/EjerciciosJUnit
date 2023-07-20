/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjunit.services;

import ejerciciosjunit.entities.DiscountCalculator;

/**
 *
 * @author luis_
 */
public class DiscountCalculatorService {
    
    public DiscountCalculatorService(){}
    
    public double calculateDiscount(DiscountCalculator discountCalculator){
        double discount = 0;
        if (discountCalculator.getPrice() > 0 && discountCalculator.getDiscount() > 0){
            if (discountCalculator.getDiscount() <= discountCalculator.getMaxDiscount()){
                discount = (discountCalculator.getDiscount() / 100) * discountCalculator.getPrice();
            }else{
                discount = (discountCalculator.getMaxDiscount() / 100) * discountCalculator.getPrice();
            }
        }
        return discount;
    }
}
