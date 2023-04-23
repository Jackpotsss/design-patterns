package org.jackpot.builder;

public class Student {

    private String code;
    private String name;
    private int age;
    private String sex;

    private Student() {}

    public static Student newBuilder(){
        return new Student();
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public Student setCode(String code) {
        this.code = code;
        return this;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public Student setSex(String sex) {
        this.sex = sex;
        return this;
    }
}
