package org.jackpot.mediator;

public class ChatRoom implements Mediator{
    @Override
    public void send(String message, Colleague colleague) {
        colleague.send(message);
    }
}
