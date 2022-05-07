package designpattern.decorator;

public class app {

    public static void main(String[] args) {
    Beverage beverage = new Milk(new PlainBeverage());
    Beverage beverage1 = new Milk(new Milk(new PlainBeverage()));
    Beverage beverage3 = new PlainBeverage();
        System.out.println(beverage.getCost());
        System.out.println(beverage.getDescription());
        System.out.println(beverage1.getCost());
        System.out.println(beverage1.getDescription());
        System.out.println(beverage3.getCost());
        System.out.println(beverage3.getDescription());

    }
}
