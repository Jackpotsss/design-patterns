package org.jackpot.singleton.destory;

import org.jackpot.singleton.SingletonLazy;

import java.io.*;

public class SerialBreak {

    public static void main(String[] args) throws Exception {
        //序列化
        SingletonLazyPlus instance1 = SingletonLazyPlus.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("tempFile"));
        objectOutputStream.writeObject(instance1);
        //反序列化
        File file = new File("tempFile");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));
        SingletonLazyPlus instance2 = (SingletonLazyPlus) objectInputStream.readObject();
        System.out.println(instance1 == instance2);
    }
}
