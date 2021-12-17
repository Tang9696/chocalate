package by.bsu.chocalate.view;

import by.bsu.chocalate.model.AbstaractSweet;
import by.bsu.chocalate.model.Division;

import java.util.List;

public class DivisionPrinter {

    public void print(Division division){
        List<AbstaractSweet> sweets = division.getSweets();
        for (AbstaractSweet sweet : sweets){
            System.out.println("The name =:" + sweet.getName());
            System.out.println("The price =" + sweet.getPrice());
            System.out.println("The wight =" + sweet.getWeight());
        }
    }
}
