package org.jackpot.observer;

//观察者:气象信息显示板
public class CurrentDisplay implements Observer{

    private float temp;
    private float humidity;
    private float perssure;
    private Subject subject;

    public CurrentDisplay(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);//自动订阅主题
    }

    @Override
    public void update(float temp, float humidity, float perssure) {
        this.temp = temp;
        this.humidity = humidity;
        this.perssure = perssure;
        display();
    }

    public void display() {
        System.out.println("CurrentDisplay [temp=" + temp + ", humidity=" + humidity + ", perssure=" +			 		perssure + "]");
    }
}
