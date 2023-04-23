package org.jackpot.observer;

import java.util.ArrayList;
import java.util.List;

//主题:气象信息
public class WeatherData implements Subject {

    private List<Observer> observers;
    private float temp;//温度
    private float humidity;//湿度
    private float perssure;//气压

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(temp, humidity, perssure);
        }
    }

    public void setData(float temp, float humidity, float perssure) {
        this.temp = temp;
        this.humidity = humidity;
        this.perssure = perssure;
        notifyObservers();
    }
}
