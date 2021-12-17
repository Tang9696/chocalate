package by.bsu.chocalate.test;

import by.bsu.chocalate.logic.DivisionCalculator;
import by.bsu.chocalate.model.AbstaractSweet;
import by.bsu.chocalate.model.ChocalateBar;
import by.bsu.chocalate.model.ChocalateSweet;
import by.bsu.chocalate.model.Division;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class DivisionCalculatorTest {

    Division division = new Division();
    DivisionCalculator calculator = new DivisionCalculator();

    @Test
    public void calculatorTotalweight(){
        ChocalateSweet chocalateSweet = new ChocalateSweet("kissis",23.0,23.0,"chocalate");
        ChocalateBar chocalateBar = new ChocalateBar("Nestle",16.0,19.3,"chocalateBar");
        division.add(chocalateSweet);
        division.add(chocalateBar);
        double totalWeight = calculator.calculatorTotalweight(division);
        Assert.assertEquals(39.0,totalWeight,0.0);
    }
    @Test
    public void calculatorTotalprice(){
        ChocalateSweet chocalateSweet = new ChocalateSweet("kissis",23.0,23.0,"chocalate");
        ChocalateBar chocalateBar = new ChocalateBar("Nestle",16.0,19.3,"chocalateBar");
        division.add(chocalateSweet);
        division.add(chocalateBar);
        double totalPrice = calculator.calculatorTotalprice(division);
        Assert.assertEquals(42.3,totalPrice,0.0);
    }
    @Test
    public void calculatorNegativeTotalweight(){
        ChocalateSweet chocalateSweet = new ChocalateSweet("kissis",-23.0,23.0,"chocalate");
        ChocalateBar chocalateBar = new ChocalateBar("Nestle",-16.0,19.3,"chocalateBar");
        division.add(chocalateSweet);
        division.add(chocalateBar);
        double totalWeight = calculator.calculatorTotalweight(division);
        Assert.assertEquals(-39.0,totalWeight,0.0);
    }
    @Test
    public void calculatorNegativeTotalprice(){
        ChocalateSweet chocalateSweet = new ChocalateSweet("kissis",23.0,-23.0,"chocalate");
        ChocalateBar chocalateBar = new ChocalateBar("Nestle",16.0,-19.3,"chocalateBar");
        division.add(chocalateSweet);
        division.add(chocalateBar);
        double totalPrice = calculator.calculatorTotalprice(division);
        Assert.assertEquals(-42.3,totalPrice,0.0);
    }
}
