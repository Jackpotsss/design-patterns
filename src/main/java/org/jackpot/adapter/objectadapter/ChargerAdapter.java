package org.jackpot.adapter.objectadapter;

import org.jackpot.adapter.Charge5V;

public class ChargerAdapter implements Charge5V {

    private ISocket iSocket;

    public ChargerAdapter(ISocket iSocket) {
        this.iSocket = iSocket;
    }

    @Override
    public void charging() {
        iSocket.chargingWith220V();
        System.out.println("将220V转换为5V");
    }
}
