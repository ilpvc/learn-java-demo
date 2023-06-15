package com.example.demo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static ExecutorService newCachedThreadPool(){
        return Executors.newCachedThreadPool();
    }
}
