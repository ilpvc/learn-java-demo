package com.example.demo;

import org.junit.jupiter.api.Test;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;


class Demo1ApplicationTests {


    @Test
    void testOne() {

        Count count1 = new Count();
        Thread thread = new Thread(count1,"线程1");
        Thread thread1 = new Thread(count1,"线程2");
        thread.start();
        thread1.start();
    }

    @Test
    public void testTwo(){
        ReentrantLockDemo reentrantLockDemo = new ReentrantLockDemo();
        reentrantLockDemo.method1();
    }

    @Test
    public void testThree(){
        ExecutorService executorService = new ThreadPoolExecutor(10,10,10,
                TimeUnit.MINUTES,new ArrayBlockingQueue<Runnable>(5));

        executorService.execute(()->{System.out.println("hello world");});

//        executorService.shutdownNow();
        executorService.close();
    }
    


}