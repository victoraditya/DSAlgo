package designpattern.adapter;

public class Bus implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Bus accelerating...");
    }
}
