package org.jackpot.factorymethod.dezhou;

import org.jackpot.factorymethod.product.Pizza;

//披萨的具体实现:奶酪披萨
public class CheesePizza extends Pizza {

    public CheesePizza(String name) {
        super(name);
    }
    @Override
    public void prepare() {
        System.out.println("准备芝士和奶油");
    }

    @Override
    public void bake() {
        System.out.println("烘焙15分钟");
    }

    @Override
    public void cut() {
        System.out.println("横着切");
    }
}
