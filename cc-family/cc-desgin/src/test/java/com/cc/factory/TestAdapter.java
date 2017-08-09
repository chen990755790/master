package com.cc.factory;

import com.cc.adapter.ObjectAdapter.Wrapper;
import com.cc.adapter.classadapter.Method2Class;
import com.cc.adapter.classadapter.MethodInterface;
import com.cc.adapter.interfaceadapter.Method1;
import com.cc.adapter.interfaceadapter.Method2;
import org.junit.Test;

/**
 * Created by Administrator on 2017/6/1.
 */
public class TestAdapter {

    @Test
    public void test0(){
        MethodInterface method = new Method2Class();
        method.method1();
        method.method2();
    }

    @Test
    public void test2(){
        MethodInterface methodInterface = new Method2Class();
        MethodInterface methodInterface1 = new Wrapper(methodInterface);
        methodInterface1.method2();
        methodInterface1.method1();
    }

    @Test
    public void test3(){
        MethodInterface methodInterface2 = new Method2();
        MethodInterface methodInterface1 = new Method1();
        methodInterface1.method1();
        methodInterface1.method2();
        methodInterface2.method1();
        methodInterface2.method2();
    }
}
