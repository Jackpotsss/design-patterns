package org.jackpot.abstractfactory.xiaomi;

import org.jackpot.abstractfactory.PhoneFactory;
import org.jackpot.abstractfactory.product.CPU;
import org.jackpot.abstractfactory.product.Power;
import org.jackpot.abstractfactory.product.Memory;
import org.jackpot.abstractfactory.product.Screen;

public class XMPhoneFactory implements PhoneFactory {

    @Override
    public Screen createScreen() {
        return new XMScreen();
    }

    @Override
    public Memory createMemory() {
        return new XMMemory();
    }

    @Override
    public Power createPower() {
        return new XMPower();
    }

    @Override
    public CPU createCPU() {
        return new Snapdragon888CPU();
    }
}
