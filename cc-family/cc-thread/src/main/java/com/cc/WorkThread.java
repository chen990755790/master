package com.cc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by Administrator on 2017/6/13.
 */
public class WorkThread {

    public static void main(String[] args) {
        Helper h = new Helper();
        h.init();
        h.submit("somthing...");
    }
    static class Helper{
        private final BlockingQueue<String> workQueue = new ArrayBlockingQueue<String>(10);
        private final Thread workThread = new Thread(){
            @Override
            public void run() {
                String task = null;
                while (true) {
                    try {
                         task = workQueue.take();
                    } catch (InterruptedException e) {
                        break;
                    }
                    System.out.println(doPrecess(task));
                }
            }
        };
        public void init(){
            workThread.start();
        }
        protected String doPrecess(String tack){
            return tack+"->processed.";
        }
        public void submit(String tack){
            try {
                Thread.sleep(500);
                workQueue.put(tack);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
