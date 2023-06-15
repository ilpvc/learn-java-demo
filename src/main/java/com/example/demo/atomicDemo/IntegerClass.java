package com.example.demo.atomicDemo;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Description:
 *
 * @date:2023/6/15 11:14
 * @author: ilpvc
 */
@Slf4j
public class IntegerClass implements Runnable {

    private final AtomicInteger atomicCount = new AtomicInteger(0);
    private int normalCount = 0;
    public void addCount(){
        normalCount = normalCount+1;
//        atomicCount.incrementAndGet();
//        log.info("atomicCount的值为{}",atomicCount.get());
        log.info("normalCount的值为{}",normalCount);

    }


    @Override
    public void run() {
        for (int i=0;i<=100;i++){
            addCount();
        }
    }
}
