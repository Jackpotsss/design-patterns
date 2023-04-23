package org.jackpot.iterator;
// 迭代器接口
public interface MyIterator<T> {
    boolean hasNext();
    T next();
}