package by.bsu.chocalate;

import by.bsu.chocalate.logic.DivisionCalculator;
import by.bsu.chocalate.model.ChocalateBar;
import by.bsu.chocalate.model.ChocalateSweet;
import by.bsu.chocalate.model.Division;
import by.bsu.chocalate.view.DivisionPrinter;

public class Main {

    public static void main(String[] args){

        Division division = new Division();

        ChocalateSweet chocalateSweet = new ChocalateSweet("kissis",23.0,23.0,"chocalate");
        ChocalateBar chocalateBar = new ChocalateBar("Nestle",16.0,19.3,"chocalateBar");
        division.add(chocalateSweet);
        division.add(chocalateBar);

        DivisionPrinter printer = new DivisionPrinter();
        printer.print(division);
        DivisionCalculator calculator = new DivisionCalculator();
        double totalWeight = calculator.calculatorTotalweight(division);
        double totalPrice = calculator.calculatorTotalprice(division);
        System.out.println("Total weight = " + totalWeight);
        System.out.println("Total price = " + totalPrice);
        System.out.println("Total price = " + totalPrice);
        System.out.println("Total price = " + totalPrice);
    }
}
