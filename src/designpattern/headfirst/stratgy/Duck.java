package designpattern.headfirst.stratgy;

public abstract class Duck {

    IFlyBehaviour flyBehaviour;
    IQuackBehaviour quackBehaviour;

    Duck(){}

    public void swim(){
        System.out.println("Swimming");
    }

    public abstract void display();

    public void performFly(){
        flyBehaviour.fly();
    }

    public void performQuack(){
        quackBehaviour.quack();
    }

    public void setFlyBehaviour(IFlyBehaviour fb){
        flyBehaviour=fb;
    }

    public void setQuackBehaviour(IQuackBehaviour qb){
        quackBehaviour=qb;
    }


}
