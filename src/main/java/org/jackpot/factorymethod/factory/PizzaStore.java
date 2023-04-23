package org.jackpot.factorymethod.factory;

import org.jackpot.factorymethod.product.Pizza;

//工厂父类: 定义生产披萨的工厂方法
public abstract class PizzaStore {

    public Pizza orderPizza(String name) {
        Pizza pizza = createPizza(name);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    //将创建对象的代码抽象
    protected abstract Pizza createPizza(String name);
}
