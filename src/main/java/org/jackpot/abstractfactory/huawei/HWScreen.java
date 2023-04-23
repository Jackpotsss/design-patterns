package org.jackpot.abstractfactory.huawei;

import org.jackpot.abstractfactory.product.Screen;

public class HWScreen implements Screen {

    @Override
    public double size() {
        return 6.6;
    }

    @Override
    public int refreshRate() {
        return 90;
    }

    @Override
    public String model() {
        return "OLED";
    }
}
