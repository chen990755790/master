package com.cc;

import com.cc.entity.User;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2017/6/14.
 */
public class TestTimer {

    private static final User u = new User();

    public static void main(String[] args) {
        Timer timer = new Timer();
        u.setAge(10);
        Task task = new Task();
        new Thread(task).start();
        timer.schedule(new ModifyUserByTime(),new Date(),10000);
    }

    static class Task implements Runnable {

        private int lastAge;

        public void run() {
            while (true) {
                if (lastAge != u.getAge()) {
                    System.out.println("present age is : " + u.getAge());
                    lastAge = u.getAge();
                }
            }
        }
    }

    static class ModifyUserByTime extends TimerTask {
        private int i = 0;

        public void run() {
            u.setAge(u.getAge()+1);
            System.out.println("i'm having growing one age" + u.getAge());
        }
    }
}
