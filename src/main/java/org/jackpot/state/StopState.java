package org.jackpot.state;

public class StopState implements State {
    public void handle() {
        System.out.println("Stopping  the engine.");
    }
}
