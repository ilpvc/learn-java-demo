package com.example.demo;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Count implements Runnable {
    private final Lock lock = new ReentrantLock();
    private ThreadLocal<Integer> count = new ThreadLocal<>();

    @Override
    public void run() {
        synMethod();
        count.set(0);
        while (count.get()<100){
            lock.lock();
            try {
                count.set(count.get()+1);
                System.out.println("count的值:"+count.get()+"==="+Thread.currentThread().getName());
            } finally {
                lock.unlock();
            }
        }
    }

    private int kk = 0;
    private synchronized void synMethod(){
        int i = 0;
        while (kk<=100){
            kk++;
            i++;
            System.out.println("kk的值:"+kk+",第"+i+"次");
        }
    }
}
