package org.jackpot.singleton;

/**
 * 单例模式：饿汉
 * 	因为类加载过程是线程安全的，所以饿汉模式天然就是线程安全的写法；
 * 	无论你是否使用这个对象的单例，单例对象都已经在应用启动后就准备好了，所以如果你不使用该单例对象或很晚才去使用单例对象，会造成资源不必要的浪费。
 */
public class SingletonHungry {

    private static final SingletonHungry INSTANCE = new SingletonHungry();
    private SingletonHungry(){
    }
    public static SingletonHungry getInstance() {
        return INSTANCE;
    }

}
