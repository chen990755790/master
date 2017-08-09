package com.cc.singleton;

/**
 * Created by Administrator on 2017/6/1.
 */
public class Singleton1 {

    private static Singleton1 singleton1 = null;

    private Singleton1(){}

    public static Singleton1 getSingleton1(){
        if (singleton1 == null) {
            return new Singleton1();
        }
        return singleton1;
    }

    public static Singleton1 getInstance(){
        if (singleton1 == null){
            synchronized (singleton1) {
                return new Singleton1();
            }
        }
        return singleton1;
    }
}
