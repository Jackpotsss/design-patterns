package org.jackpot.mediator;

// 抽象同事类
abstract class Colleague {
    protected Mediator mediator;
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
    public abstract void send(String message);
    public abstract void receive(String message);
}
