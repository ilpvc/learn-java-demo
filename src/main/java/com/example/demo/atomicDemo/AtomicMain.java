package com.example.demo.atomicDemo;

/**
 * Description:
 *
 * @date:2023/6/15 13:46
 * @author: ilpvc
 */
public class AtomicMain {
    public static void main(String[] args) {
        IntegerClass integerClass = new IntegerClass();
        Thread thread1 = new Thread(integerClass,"x1");
        Thread thread2 = new Thread(integerClass,"x2");
        thread2.start();
        thread1.start();
    }
}
