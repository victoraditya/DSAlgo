package designpattern.decorator;

public class PlainBeverage implements Beverage{


    @Override
    public String getDescription() {
        return "Plain";
    }

    @Override
    public Integer getCost() {
        return 5;
    }
}
