package org.jackpot.adapter.classadapter;

import org.jackpot.adapter.Charge5V;

public class ChargerAdapter extends Socket implements Charge5V {
    @Override
    public void charging() {
        chargingWith220V();
        System.out.println("将220V转换为5V");
    }
}
