package org.jackpot.factorymethod.shanghai;

import org.jackpot.factorymethod.dezhou.CheesePizza;
import org.jackpot.factorymethod.factory.PizzaStore;
import org.jackpot.factorymethod.product.Pizza;

//披萨工厂的具体实现:德州披萨商店
public class ShangHaiPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String name) {
        return new FruitPizza(name);
    }
}
