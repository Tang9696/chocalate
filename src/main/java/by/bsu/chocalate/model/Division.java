package by.bsu.chocalate.model;

import java.util.ArrayList;
import java.util.List;

public class Division {

    private List<AbstaractSweet> sweets;

    public Division(){
        sweets = new ArrayList<AbstaractSweet>();
    }

    public List<AbstaractSweet> getSweets() {
        return sweets;
    }

    public void add(AbstaractSweet sweet){
        sweets.add(sweet);
    }
}
