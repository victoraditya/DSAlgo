package designpattern.headfirst.stratgy;

public class DuckSimulator {
    public static void main(String[] args) {
        Duck model = new ModelDuck();
        model.performFly();
        model.performQuack();
        Duck mallard = new MallardDuck();
       // mallard.setFlyBehaviour(new FlyNoWay());
        mallard.performFly();
        mallard.performQuack();

    }
}
