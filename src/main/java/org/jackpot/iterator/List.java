package org.jackpot.iterator;

import java.util.ArrayList;
import java.util.Iterator;

// 列表类
class List<T> {
    private ArrayList<T> list;

    public List() {
        this.list = new ArrayList<T>();
    }

    public void add(T item) {
        list.add(item);
    }

    public MyIterator<T> iterator() {
        return new ListIterator<T>(list);
    }

}
