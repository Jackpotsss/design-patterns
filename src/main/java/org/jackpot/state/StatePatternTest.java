package org.jackpot.state;

public class StatePatternTest {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new StartState());
        context.handle();
        context.setState(new StopState());
        context.handle();
    }
}
