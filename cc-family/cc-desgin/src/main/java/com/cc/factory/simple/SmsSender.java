package com.cc.factory.simple;

/**
 * Created by Administrator on 2017/6/1.
 */
public class SmsSender implements Sender {

    public void send() {
        System.out.println("sms");
    }
}
