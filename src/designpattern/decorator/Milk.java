
package designpattern.decorator;

public class Milk extends BeverageDecorator{

   // private Beverage beverage;

    public Milk(Beverage beverage) {
        super(beverage);
       // this.beverage = beverage;
    }

    @Override
    public Integer getCost() {
        return this.beverage.getCost()+3;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription()+" Milk";
    }
}

