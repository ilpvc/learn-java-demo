package com.example.demo.ReflectDemo;

/**
 * Description:
 *
 * @date:2023/6/28 11:08
 * @author: ilpvc
 */
public class TargetObject {

    private String value;

    public TargetObject(){
        this.value = "ilpvc";
    }

    public void publicMethod(String s){
        System.out.println("I like"+s);
    }

    private void privateMethod(){
        System.out.println("I like"+value);
    }
}
