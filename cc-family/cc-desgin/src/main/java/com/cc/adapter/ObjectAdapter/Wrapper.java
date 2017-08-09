package com.cc.adapter.ObjectAdapter;

import com.cc.adapter.classadapter.MethodInterface;

/**
 * Created by Administrator on 2017/6/1.
 */
public class Wrapper implements MethodInterface {

    private MethodInterface methodInterface;

    public Wrapper(MethodInterface methodInterface){
        this.methodInterface = methodInterface;
    }

    public void method1() {
        System.out.println("wrapper-->method1");
    }

    public void method2() {
        methodInterface.method2();
    }
}
