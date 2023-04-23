package org.jackpot.facade;

public class Facade {

    private Subsystem1 subsystem1;
    private Subsystem2 subsystem2;

    public Facade() {
        this.subsystem1 = new Subsystem1();
        this.subsystem2 = new Subsystem2();
    }

    public void operation() {
        subsystem1.operation1();
        subsystem2.operation2();
    }
}
