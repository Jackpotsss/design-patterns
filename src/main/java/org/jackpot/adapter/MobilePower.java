package org.jackpot.adapter;

public class MobilePower implements Charge5V{
    @Override
    public void charging() {
        System.out.println("使用充电宝给手机充电(5V)");
    }
}
