package com.example.demo.lambdaDemo;

/**
 * Description:
 *
 * @date:2023/8/5 19:40
 * @author: ilpvc
 */
public class LambdaDemo01 {

    public static void main(String[] args) {
        LambdaTest t = ()->{
            System.out.println("无参数");
        };
        t.test();

        OneParameter o = (int a)->{
            return a+10;
        };
        System.out.println(o.test(100));

    }
}
