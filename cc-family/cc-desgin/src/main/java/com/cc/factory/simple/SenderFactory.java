package com.cc.factory.simple;

/**
 * Created by Administrator on 2017/6/1.
 */
public class SenderFactory {

    public Sender createFactry(String type){
        if (type.equals("sms")) {
            return new SmsSender();
        }else if (type.equals("mail")) {
            return new MailSender();
        }else {
            return null;
        }
    }
}
