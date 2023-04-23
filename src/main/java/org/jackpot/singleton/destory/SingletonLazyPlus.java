package org.jackpot.singleton.destory;

import java.io.Serializable;

/**
 * 单例模式：懒汉
 * 使用构造器判断 + 实现 readResolve() 方法的方式来防止单例被破坏。
 */
public class SingletonLazyPlus implements Serializable {

    private volatile static SingletonLazyPlus INSTANCE;
    private SingletonLazyPlus() {
        if(INSTANCE!=null){
            throw new RuntimeException("不允许反射调用构造器");
        }
    }
    //双重检查+互斥锁
    public static SingletonLazyPlus getInstance() {
        if (INSTANCE==null) {
            synchronized (SingletonLazyPlus.class) {
                if (INSTANCE==null) {
                    INSTANCE = new SingletonLazyPlus();
                }
            }
        }
        return INSTANCE;
    }

    private Object readResolve() {
        return SingletonLazyPlus.INSTANCE;
    }
}
