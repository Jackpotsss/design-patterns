package org.jackpot.abstractfactory.huawei;

import org.jackpot.abstractfactory.product.Memory;

public class HWMemory implements Memory {

    @Override
    public int capacity() {
        return 12;
    }

    @Override
    public int speed() {
        return 2800;
    }

    @Override
    public String model() {
        return "DDR5";
    }
}
