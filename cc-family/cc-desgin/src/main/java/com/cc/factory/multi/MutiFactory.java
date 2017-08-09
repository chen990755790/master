package com.cc.factory.multi;

import com.cc.factory.simple.MailSender;
import com.cc.factory.simple.Sender;
import com.cc.factory.simple.SmsSender;

/**
 * Created by Administrator on 2017/6/1.
 */
public class MutiFactory {

    public Sender createSms(){
        return new SmsSender();
    }

    public Sender createMail(){
        return new MailSender();
    }
}
