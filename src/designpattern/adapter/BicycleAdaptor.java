package designpattern.adapter;

public class BicycleAdaptor implements Vehicle{

    Bicycle bicycle;

    public BicycleAdaptor(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    @Override
    public void accelerate() {
        this.bicycle.go();
    }
}
