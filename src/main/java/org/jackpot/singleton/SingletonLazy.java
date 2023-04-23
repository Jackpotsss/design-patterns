package org.jackpot.singleton;

import java.io.Serializable;

/**
 * 单例模式：懒汉
 * 与饿汉天然支持线程安全不同，懒汉的写法必须考虑到线程安全问题，这里使用了双重检查+互斥锁的方式保证线程安全。
 * 之所以这么写是为了规避一种情况：线程A和B同时判断单例对象为空，并准备创建对象，A持有类锁开始创建对象，B在临界区外等待，当A释放锁后，
 * 单例对象其实创建完毕，不需要B再去创建对象，所以B进入临界区后，再次判断单例对象是否创建，如果已经创建（volatile保证多线程同步的内存可见性），
 * 那么就不需要再次创建了。
 * 双重检查+锁的逻辑只会在单例对象为空的情况下运行，一旦单例对象创建成功，获取单例对象只需要一次判断的逻辑即可，因此不存在效率问题。
 */
public class SingletonLazy{

    private volatile static SingletonLazy INSTANCE;
    private SingletonLazy(){}
    //双重检查+互斥锁
    public static SingletonLazy getInstance() {
        if (INSTANCE==null) {
            synchronized (SingletonLazy.class) {
                if (INSTANCE==null) {
                    INSTANCE = new SingletonLazy();
                }
            }
        }
        return INSTANCE;
    }
}
