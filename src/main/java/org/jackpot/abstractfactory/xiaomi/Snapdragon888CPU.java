package org.jackpot.abstractfactory.xiaomi;

import org.jackpot.abstractfactory.product.CPU;

public class Snapdragon888CPU implements CPU {

    @Override
    public double speed() {
        return 2.8;
    }

    @Override
    public int threadsNum() {
        return 12;
    }

    @Override
    public String model() {
        return "骁龙888处理器";
    }
}
