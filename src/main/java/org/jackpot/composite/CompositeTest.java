package org.jackpot.composite;

import java.util.List;

public class CompositeTest {

    public static void main(String[] args) {
        Employee CEO = new Employee("jack", 50);
        Employee manager1 = new Employee("manager1", 35);
        Employee manager2 = new Employee("manager2", 39);
        CEO.addSubordinate(manager1);
        CEO.addSubordinate(manager2);

        Employee staff1 = new Employee("staff1", 30);
        Employee staff2 = new Employee("staff2", 23);
        Employee staff3 = new Employee("staff3", 32);
        manager1.addSubordinate(staff1);
        manager1.addSubordinate(staff2);
        manager2.addSubordinate(staff3);
        getAllEmployeeByThis(CEO);
    }

    public static void getAllEmployeeByThis(Employee employee) {
        System.out.println(employee.toString());
        List<Employee> subordinates = employee.getSubordinates();
        for (Employee e : subordinates) {
            getAllEmployeeByThis(e);
        }
    }
}
