package org.jackpot.abstractfactory.xiaomi;

import org.jackpot.abstractfactory.product.Memory;

public class XMMemory implements Memory {

    @Override
    public int capacity() {
        return 16;
    }

    @Override
    public int speed() {
        return 2600;
    }

    @Override
    public String model() {
        return "DDR4";
    }
}
