package org.jackpot.builder;

public class TestBuilder {

    public static void main(String[] args) {
        Student student = Student.newBuilder().setCode("001").setName("Jackpot").setAge(18).setSex("男");
    }
}
