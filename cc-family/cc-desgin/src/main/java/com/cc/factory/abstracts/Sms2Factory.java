package com.cc.factory.abstracts;

import com.cc.factory.simple.Sender;
import com.cc.factory.simple.SmsSender;

/**
 * Created by Administrator on 2017/6/1.
 */
public class Sms2Factory implements AbstractFactory {

    public Sender produce() {
        return new SmsSender();
    }
}
