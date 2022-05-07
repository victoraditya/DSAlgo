package designpattern.headfirst.stratgy;

public class FlyWithWings implements IFlyBehaviour{
    @Override
    public void fly() {
        System.out.println("I'm flying with wings");
    }
}
