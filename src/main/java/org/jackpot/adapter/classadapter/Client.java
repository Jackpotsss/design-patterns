package org.jackpot.adapter.classadapter;

import org.jackpot.adapter.MobilePower;
import org.jackpot.adapter.Phone;

public class Client {

    public static void main(String[] args) {

        MobilePower mobilePower = new MobilePower();
        Phone phone = new Phone();
        phone.charge(mobilePower); //手机可以直接使用充电宝充电

        ChargerAdapter chargerAdapter = new ChargerAdapter();
        phone.charge(chargerAdapter); //在220V插座和充电线之间加一个适配器，才能给手机充电；

    }
}
