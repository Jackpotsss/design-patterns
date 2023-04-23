package org.jackpot.flyweight;

import java.util.HashMap;
import java.util.Map;

public class Staff {

    private int id;
    private String name;

    public Staff(int id, String name) {
        this.id = id;
        this.name = name;
    }

    private static final Map<String, Staff> cache = new HashMap<>();

    // 静态工厂方法:
    public static Staff create(int id, String name) {
        String key = id + "" + name;
        // 先查找缓存:
        Staff staff = cache.get(key);
        if (staff == null) { // 未找到,创建新对象
            System.out.println(String.format("create new Student(%s, %s)", id, name));
            staff = new Staff(id, name);
            cache.put(key, staff);// 放入缓存
        } else {// 缓存中存在
            System.out.println(String.format("return cached Student(%s, %s)", staff.id, staff.name));
        }
        return staff;
    }

    public static void main(String[] args) {

        Staff staff = create(1, "Jackpot");
        Staff staff2 = create(1, "Jackpot");
        System.out.println(staff==staff2);

    }
}
