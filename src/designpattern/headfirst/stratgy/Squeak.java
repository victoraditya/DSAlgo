package designpattern.headfirst.stratgy;

public class Squeak implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
