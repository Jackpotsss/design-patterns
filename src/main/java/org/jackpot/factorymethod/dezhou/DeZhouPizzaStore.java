package org.jackpot.factorymethod.dezhou;

import org.jackpot.factorymethod.factory.PizzaStore;
import org.jackpot.factorymethod.product.Pizza;

//披萨工厂的具体实现:德州披萨商店
public class DeZhouPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String name) {
        return new CheesePizza(name);
    }
}
