package org.jackpot.observer;

public class ObserverDemo {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentDisplay currentDisplay = new CurrentDisplay(weatherData);
        weatherData.setData(12, 23, 33);
    }
}
