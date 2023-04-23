package org.jackpot.abstractfactory.xiaomi;

import org.jackpot.abstractfactory.product.Screen;

public class XMScreen implements Screen {

    @Override
    public double size() {
        return 6.73;
    }

    @Override
    public int refreshRate() {
        return 120;
    }

    @Override
    public String model() {
        return "OLED";
    }
}
