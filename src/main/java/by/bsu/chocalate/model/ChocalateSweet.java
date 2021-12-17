package by.bsu.chocalate.model;

public class ChocalateSweet extends AbstaractSweet{

    private String chocolateType;


    public ChocalateSweet(String name, double weight, double price,String chocolateType) {
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
