package org.jackpot.composite;

import java.util.ArrayList;
import java.util.List;

//雇员
public class Employee {

    private String name;
    private int age;
    List<Employee> subordinates; //下属职员

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
        subordinates = new ArrayList<Employee>();
    }

    public void addSubordinate(Employee e) {
        subordinates.add(e);
    }

    public void removeSubordinate(Employee e) {
        subordinates.remove(e);
    }

    public List<Employee> getSubordinates(){
        return subordinates;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", age=" + age + "]";
    }
}
