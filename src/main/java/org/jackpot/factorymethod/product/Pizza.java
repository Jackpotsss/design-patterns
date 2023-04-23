package org.jackpot.factorymethod.product;
//产品: 披萨超类
public abstract class Pizza {
    private String name;

    public Pizza(String name) {
        this.name=name;
    }
    public abstract void prepare();
    public abstract void bake();
    public abstract void cut();

    public void box() {
        System.out.println("打包披萨...");
    };
    public String getName() {
        return name;
    }
}
