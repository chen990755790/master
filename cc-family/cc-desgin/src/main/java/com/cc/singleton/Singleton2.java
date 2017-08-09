package com.cc.singleton;

/**
 * Created by Administrator on 2017/6/1.
 */
public class Singleton2 {

    private Singleton2(){};

    private static class Singleton2Factory{
        private static Singleton2 instance = new Singleton2();
    }

    public Singleton2 getInstance(){
        return Singleton2Factory.instance;
    }

}
