package com.cc;


import org.junit.Test;

import java.util.concurrent.*;

/**
 * Created by Administrator on 2017/6/2.
 */
public class TestThread {


    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, Runtime.getRuntime().availableProcessors(), 60, TimeUnit.MINUTES, new SynchronousQueue<Runnable>(), new ThreadFactory() {
            public Thread newThread(Runnable r) {
                Thread t = new Thread(r);
                t.setDaemon(true);
                return t;
            }
        }, new ThreadPoolExecutor.CallerRunsPolicy());
        for (int i = 1; i < 11; i++) {
            threadPoolExecutor.submit(new Task());
        }
        while (threadPoolExecutor.getActiveCount()!=0){
            System.out.println("some task :"+threadPoolExecutor.getActiveCount());
            try {
                Thread.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static class Task implements Runnable {

        public void run() {
            for (int j = 0; j < 10; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
