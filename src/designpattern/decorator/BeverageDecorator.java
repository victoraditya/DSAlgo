package designpattern.decorator;

public abstract class BeverageDecorator implements Beverage{

    Beverage beverage;

    public BeverageDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    public BeverageDecorator() {

    }

    @Override
    public Integer getCost() {
        return this.beverage.getCost();
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription();
    }
}
