package designpattern.headfirst.observer;

public class CurrentConditionsDisplay implements Observer,DisplayElement{

    private float temperature;
    private float humidity;
    private WeatherData weatherData;

    CurrentConditionsDisplay(WeatherData weatherData){
        this.weatherData=weatherData;
        weatherData.registerObserver(this);
    }


    @Override
    public void display() {
        System.out.println("Current Conditions: " +temperature+"C degrees and " +humidity+"% humidity");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.humidity=humidity;
        this.temperature=temp;
        display();
    }
}
