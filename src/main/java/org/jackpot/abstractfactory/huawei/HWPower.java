package org.jackpot.abstractfactory.huawei;

import org.jackpot.abstractfactory.product.Power;

public class HWPower implements Power {

    @Override
    public int capacity() {
        return 4500;
    }

    @Override
    public int power() {
        return 45;
    }
}
