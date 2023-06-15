package com.example.demo;

public class ReentrantLockDemo {

    public synchronized void method1(){
        System.out.println("我是方法1");
        method2();
    }

    public synchronized void method2(){
        System.out.println("我是方法2");
    }
}
