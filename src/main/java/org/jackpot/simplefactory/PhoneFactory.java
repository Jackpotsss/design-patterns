package org.jackpot.simplefactory;

public class PhoneFactory {

    public static Phone getPhone(String type){
        if("XM".equals(type)){
            return new XMPhone();
        }else if("HW".equals(type)){
            return new HWPhone();
        }
        return null;
    }
}
