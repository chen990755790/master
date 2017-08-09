package com.cc.factory.statics;

import com.cc.factory.simple.MailSender;
import com.cc.factory.simple.Sender;
import com.cc.factory.simple.SmsSender;

/**
 * Created by Administrator on 2017/6/1.
 */
public class StaticFactory {

    public static Sender createMail(){
        return new MailSender();
    }

    public static Sender createSms(){
        return new SmsSender();
    }

}
