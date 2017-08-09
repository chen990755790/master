package com.cc.factory;

import com.cc.builder.BuilderFactory;
import com.cc.factory.abstracts.AbstractFactory;
import com.cc.factory.abstracts.Mail2Factory;
import com.cc.factory.multi.MutiFactory;
import com.cc.factory.simple.Sender;
import com.cc.factory.simple.SenderFactory;
import com.cc.factory.statics.StaticFactory;
import org.junit.Test;

/**
 * Created by Administrator on 2017/6/1.
 */
public class TestFactory {

    @Test
    public void test0(){
        SenderFactory factory = new SenderFactory();
        Sender sender = factory.createFactry("sms");
        sender.send();
    }

    @Test
    public void test1(){
        MutiFactory factory = new MutiFactory();
        Sender mail = factory.createMail();
        mail.send();
    }

    @Test
    public void test2(){
        Sender mail = StaticFactory.createMail();
        mail.send();
    }

    @Test
    public void test3(){
        AbstractFactory factory = new Mail2Factory();
        Sender produce = factory.produce();
        produce.send();
    }

    @Test
    public void test4(){
        BuilderFactory factory = new BuilderFactory();
        factory.createMail(2);
        factory.createSms(2);
        factory.getInstance().send();
        factory.getInstance().send();
        factory.getInstance().send();
        factory.getInstance().send();
    }
}
