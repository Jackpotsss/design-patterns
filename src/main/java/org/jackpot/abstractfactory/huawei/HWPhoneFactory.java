package org.jackpot.abstractfactory.huawei;

import org.jackpot.abstractfactory.PhoneFactory;
import org.jackpot.abstractfactory.product.CPU;
import org.jackpot.abstractfactory.product.Power;
import org.jackpot.abstractfactory.product.Memory;
import org.jackpot.abstractfactory.product.Screen;

public class HWPhoneFactory implements PhoneFactory {

    @Override
    public Screen createScreen() {
        return new HWScreen();
    }

    @Override
    public Memory createMemory() {
        return new HWMemory();
    }

    @Override
    public Power createPower() {
        return new HWPower();
    }

    @Override
    public CPU createCPU() {
        return new Kylin970CPU();
    }
}
