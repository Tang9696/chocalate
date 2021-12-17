package by.bsu.chocalate.model;

public class ChocalateBar extends AbstaractSweet{
    private String chocolateType;

    public ChocalateBar(String name, double weight, double price,String chocolateType) {
        super(name, weight, price);
        this.chocolateType = chocolateType;
    }

    public String getChocolateType() {
        return chocolateType;
    }

    public void setChocolateType(String chocolateType) {
        this.chocolateType = chocolateType;
    }
}
