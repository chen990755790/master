package com.cc.builder;

import com.cc.factory.simple.MailSender;
import com.cc.factory.simple.Sender;
import com.cc.factory.simple.SmsSender;

import java.util.Vector;

/**
 * Created by Administrator on 2017/6/1.
 */
public class BuilderFactory {

    private Vector<Sender> vector = new Vector<Sender>();

    public void createMail(int count){
        for (int i=0;i<count;i++) {
            vector.add(new MailSender());
        }
    }

    public void createSms(int count){
        for (int i=0;i<count;i++) {
            vector.add(new SmsSender());
        }
    }

    public Sender getInstance(){
        Sender sender = vector.lastElement();
        if (sender != null)
        vector.remove(vector.size()-1);
        return sender;
    }
}
