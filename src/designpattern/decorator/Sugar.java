package designpattern.decorator;

public class Sugar extends BeverageDecorator {
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    public Sugar() {
        super();
    }


    @Override
    public Integer getCost() {
        return super.getCost()+1;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Sugar";
    }
}
