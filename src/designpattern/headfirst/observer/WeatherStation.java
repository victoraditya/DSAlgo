package designpattern.headfirst.observer;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80,65,30);
        weatherData.setMeasurements(60,45,20);
        weatherData.setMeasurements(40,25,10);
        weatherData.setMeasurements(20,5,5);
    }
}
