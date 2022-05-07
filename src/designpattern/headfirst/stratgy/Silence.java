package designpattern.headfirst.stratgy;

public class Silence implements IQuackBehaviour{
    @Override
    public void quack() {
        System.out.println("silence");
    }
}
