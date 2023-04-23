package org.jackpot.prototype;

public class prototypeTest {

    public static void main(String[] args) {

        Staff staff = new Staff();
        staff.age = 33;
        staff.name = "Jack";
        staff.dept = new Staff.Dept("dept1");

        Staff clone = staff.clone();
        System.out.println(clone.dept.name); //输出：dept1
        staff.dept.name = "dept2";//改变源对象的属性值
        System.out.println(clone.dept.name);    //输出：dept2

    }
}
