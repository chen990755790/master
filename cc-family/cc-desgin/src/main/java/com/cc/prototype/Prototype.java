package com.cc.prototype;

/**
 * Created by Administrator on 2017/6/1.
 */
public class Prototype implements Cloneable{

    public Object clone() throws CloneNotSupportedException {
        return  (Prototype)super.clone();
    }
}
