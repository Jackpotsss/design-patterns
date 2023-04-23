package org.jackpot.mediator;

// 具体同事类
class User extends Colleague {
    private String name;
    public User(String name) {
        this.name = name;
    }
    public void send(String message) {
        System.out.println(name + "发送了消息：" + message);
        mediator.send(message, this);
    }
    public void receive(String message) {
        System.out.println(name + "接收到消息：" + message);
    }
}