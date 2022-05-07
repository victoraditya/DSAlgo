package designpattern.headfirst.stratgy;

public class ModelDuck extends Duck{
    @Override
    public void display() {
        System.out.println("Model Duck");
    }

    ModelDuck(){
        flyBehaviour=new FlyNoWay();
        quackBehaviour=new Silence();
    }
}
