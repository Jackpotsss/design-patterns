package org.jackpot.iterator;

import java.util.Arrays;
import java.util.Iterator;

public class IteratorTest {

    public static void main(String[] args) {
        List<String> list = new List<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");

        // 使用迭代器遍历列表
        MyIterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        java.util.List<String> strings = Arrays.asList("apple", "banana", "cherry");
        Iterator<String> iterator1 = strings.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
