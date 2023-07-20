/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosjunit.entities;

/**
 *
 * @author luis_
 */
public class DiscountCalculator {
    
    private double price;
    private double discount;
    private double maxDiscount;

    public DiscountCalculator(double price, int discount, int maxDiscount) {
        this.price = price;
        this.discount = discount;
        this.maxDiscount = maxDiscount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
    
    public double getMaxDiscount() {
        return maxDiscount;
    }

    public void setMaxDiscount(double maxDiscount) {
        this.maxDiscount = maxDiscount;
    }
}
