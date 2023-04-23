package org.jackpot.abstractfactory.xiaomi;

import org.jackpot.abstractfactory.product.Power;

public class XMPower implements Power {

    @Override
    public int capacity() {
        return 5000;
    }

    @Override
    public int power() {
        return 67;
    }
}
