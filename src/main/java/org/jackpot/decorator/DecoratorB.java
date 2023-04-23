package org.jackpot.decorator;

public class DecoratorB extends Decorator{

    public DecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addedFunction();
    }

    private void addedFunction() {
        System.out.println("Added function from DecoratorB");
    }
}
