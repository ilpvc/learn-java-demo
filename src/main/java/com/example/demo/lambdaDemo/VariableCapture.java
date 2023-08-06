package com.example.demo.lambdaDemo;

/**
 * Description:
 *
 * @date:2023/8/6 23:07
 * @author: ilpvc
 */
public class VariableCapture {
    public static void main(String[] args) {
        int a = 100;
        Test t = new Test(){
            @Override
            public void func(){
                System.out.println("捕获的变量是："+a);
            }
        };
        t.func();
    }
}
class Test{
    public void func(){
        System.out.println("func");
    }
}