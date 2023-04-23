package org.jackpot.singleton.destory;

import org.jackpot.singleton.SingletonLazy;

import java.lang.reflect.Constructor;

public class ReflectBreak {

    public static void main(String[] args) throws Exception {

        SingletonLazyPlus instance1 = SingletonLazyPlus.getInstance();
        //通过反射创建对象
        Constructor<SingletonLazyPlus> constructor = SingletonLazyPlus.class.getDeclaredConstructor();
        constructor.setAccessible(true); //设置可以访问私有构造器
        SingletonLazyPlus instance2 = constructor.newInstance();
        System.out.println(instance1 == instance2);
    }
}
