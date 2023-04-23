package org.jackpot.factorymethod.shanghai;

import org.jackpot.factorymethod.product.Pizza;

/**
 * 披萨的具体实现:水果披萨
 */
public class FruitPizza extends Pizza {

    public FruitPizza(String name) {
        super(name);
    }
    @Override
    public void prepare() {
        System.out.println("准备榴莲和芒果");
    }

    @Override
    public void bake() {
        System.out.println("烘焙8分钟");
    }

    @Override
    public void cut() {
        System.out.println("竖着切");
    }
}
