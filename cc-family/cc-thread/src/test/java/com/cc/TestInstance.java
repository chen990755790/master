package com.cc;

import com.cc.entity.Human;
import com.cc.entity.Parent;
import com.cc.entity.User;

/**
 * Created by Administrator on 2017/8/4.
 */
public class TestInstance {

    public static void main(String[] args) {
        if (getParent() instanceof Human){
            System.out.println("is humen");
        }
        else {
            System.out.println("not humen");
        }
    }

    public static Parent getParent(){
        return new User();
    }
}
