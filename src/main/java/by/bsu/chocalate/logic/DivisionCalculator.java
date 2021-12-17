package by.bsu.chocalate.logic;

import by.bsu.chocalate.model.AbstaractSweet;
import by.bsu.chocalate.model.Division;

import java.util.List;

public class DivisionCalculator {

    public double calculatorTotalweight(Division division){
        List<AbstaractSweet> sweets = division.getSweets();
        double totalWeight = 0;
        for (AbstaractSweet sweet : sweets){
            totalWeight = totalWeight + sweet.getWeight();
        }
        return totalWeight;
    }

    public double calculatorTotalprice(Division division){
        List<AbstaractSweet> sweets = division.getSweets();
        double totalPrice = 0;
        for (AbstaractSweet sweet : sweets){
            totalPrice = totalPrice + sweet.getPrice();
        }
        return totalPrice;
    }
}
