package org.jackpot.decorator;

public class DecoratorPatternDemo {

    public static void main(String[] args) {
        Component component = new ComponentImpl();
        Component decoratorA = new DecoratorA(component);
        decoratorA.operation();
        Component decoratorB = new DecoratorB(component);
        decoratorB.operation();
    }
}
