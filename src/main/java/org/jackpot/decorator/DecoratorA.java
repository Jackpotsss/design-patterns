package org.jackpot.decorator;

public class DecoratorA extends Decorator{

    public DecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    private void addedFunction() {
        System.out.println("Added function from DecoratorA");
    }
}
