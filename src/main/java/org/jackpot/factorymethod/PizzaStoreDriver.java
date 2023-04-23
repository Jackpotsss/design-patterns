package org.jackpot.factorymethod;

import org.jackpot.factorymethod.dezhou.DeZhouPizzaStore;
import org.jackpot.factorymethod.factory.PizzaStore;
import org.jackpot.factorymethod.shanghai.ShangHaiPizzaStore;

public class PizzaStoreDriver {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new DeZhouPizzaStore();
        pizzaStore.orderPizza("奶酪披萨");
        System.out.println("===================================");
        pizzaStore = new ShangHaiPizzaStore();
        pizzaStore.orderPizza("水果披萨");
    }
}
