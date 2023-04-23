package org.jackpot.flyweight;

public class FlyWeightTest {

    public static void main(String[] args) {
        Integer n1 = Integer.valueOf(100);
        Integer n2 = Integer.valueOf(100);
        System.out.println(n1 == n2); // true

        Integer n3 = Integer.valueOf(128);
        Integer n4 = Integer.valueOf(128);
        System.out.println(n3 == n4); // false

    }
}
