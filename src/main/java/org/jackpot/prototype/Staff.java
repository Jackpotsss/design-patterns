package org.jackpot.prototype;

public class Staff implements Cloneable {

    String name;
    int age;
    Dept dept;

    @Override
    public Staff clone() {
        try {
            return (Staff) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    static class Dept{
        String name;

        public Dept(String name) {
            this.name = name;
        }
    }
}
