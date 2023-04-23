package org.jackpot.adapter.objectadapter;

import org.jackpot.adapter.Phone;

public class Client {

    public static void main(String[] args) {

        ISocket socket = new SocketImpl();
        ChargerAdapter chargerAdapter = new ChargerAdapter(socket); //充电器将22V适配为5V
        Phone phone = new Phone();
        phone.charge(chargerAdapter);
    }
}
