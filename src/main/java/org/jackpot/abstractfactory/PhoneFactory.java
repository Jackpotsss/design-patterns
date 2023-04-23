package org.jackpot.abstractfactory;

import org.jackpot.abstractfactory.product.CPU;
import org.jackpot.abstractfactory.product.Power;
import org.jackpot.abstractfactory.product.Memory;
import org.jackpot.abstractfactory.product.Screen;

/**
 * 手机工厂
 * 屏幕
 * 内存
 * 硬盘
 * CPU
 */
public interface PhoneFactory {

    Screen createScreen();

    Memory createMemory();

    Power createPower();

    CPU createCPU();

}
