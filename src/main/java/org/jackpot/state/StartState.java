package org.jackpot.state;

public class StartState implements State {
    public void handle() {
        System.out.println("Starting the engine.");
    }
}
