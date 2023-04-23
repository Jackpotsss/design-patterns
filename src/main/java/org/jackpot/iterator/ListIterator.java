package org.jackpot.iterator;

import java.util.ArrayList;

// 具体迭代器类
public class ListIterator<T> implements MyIterator<T> {
    private ArrayList<T> list;
    private int index;

    public ListIterator(ArrayList<T> list) {
        this.list = list;
        this.index = 0;
    }

    public boolean hasNext() {
        return index < list.size();
    }

    public T next() {
        if (hasNext()) {
            T item = list.get(index);
            index++;
            return item;
        } else {
            return null;
        }
    }
}