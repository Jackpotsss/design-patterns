package org.jackpot.abstractfactory;

import org.jackpot.abstractfactory.huawei.HWPhoneFactory;
import org.jackpot.abstractfactory.product.CPU;
import org.jackpot.abstractfactory.product.Memory;
import org.jackpot.abstractfactory.product.Power;
import org.jackpot.abstractfactory.product.Screen;
import org.jackpot.abstractfactory.xiaomi.XMPhoneFactory;

public class FactoryTest {

    public static void main(String[] args) {
        PhoneFactory phoneFactory = new XMPhoneFactory();
        createPhone(phoneFactory);
        System.out.println("======================================");
        phoneFactory = new HWPhoneFactory();
        createPhone(phoneFactory);
    }

    public static void createPhone(PhoneFactory phoneFactory){
        CPU cpu = phoneFactory.createCPU();
        Memory memory = phoneFactory.createMemory();
        Screen screen = phoneFactory.createScreen();
        Power power = phoneFactory.createPower();
        printArg(cpu,memory,power,screen);
    }

    private static String printArg(CPU cpu, Memory memory, Power power, Screen screen){

        System.out.println(String.format("CPU参数：%s,%s GHz频率，线程数：%s",cpu.model(),cpu.speed(),cpu.threadsNum()));
        System.out.println(String.format("内存参数：%s,%s MHz频率，容量（Gb）：%s",memory.model(),memory.speed(),memory.capacity()));
        System.out.println("电源及电池参数："+power.power()+"W,容量："+power.capacity()+"mA");
        System.out.println("屏幕："+screen.model()+","+screen.refreshRate()+"Hz刷新率，尺寸（英寸）："+screen.size());
        return null;
    }
}
