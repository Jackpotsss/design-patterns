package org.jackpot.adapter.objectadapter;

public class SocketImpl implements ISocket{
    @Override
    public void chargingWith220V() {
        System.out.println("使用插座直接充电（220V）");
    }
}
