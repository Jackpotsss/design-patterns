package org.jackpot.abstractfactory.huawei;

import org.jackpot.abstractfactory.product.CPU;

public class Kylin970CPU implements CPU {

    @Override
    public double speed() {
        return 2.4;
    }

    @Override
    public int threadsNum() {
        return 8;
    }

    @Override
    public String model() {
        return "麒麟970处理器";
    }
}
