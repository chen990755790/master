package com.cc.factory.abstracts;

import com.cc.factory.simple.MailSender;
import com.cc.factory.simple.Sender;

/**
 * Created by Administrator on 2017/6/1.
 */
public class Mail2Factory implements AbstractFactory {
    public Sender produce() {
        return new MailSender();
    }
}
