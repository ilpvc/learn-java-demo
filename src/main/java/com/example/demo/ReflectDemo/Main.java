package com.example.demo.ReflectDemo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Description:
 *
 * @date:2023/6/28 11:10
 * @author: ilpvc
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        /**
         * 获取 TargetObject 类的 Class 对象并且创建 TargetObject 类实例
         */
        Class<?> targetClass = Class.forName("com.example.demo.ReflectDemo.TargetObject");
        TargetObject targetObject = (TargetObject) targetClass.newInstance();

        /**
         * 获取 TargetObject 类中定义的所有方法
         */
        Method[] methods = targetClass.getMethods();
        for (Method method:methods){
            System.out.println(method.getName());
        }

        /**
        * 获取指定方法并调用
        */
        Method publicMethod = targetClass.getDeclaredMethod("publicMethod",String.class);
        publicMethod.invoke(targetObject,"colzry");

        /**
         * 获取指定参数并对参数进行修改
         */
        Field field = targetClass.getDeclaredField("value");
        field.setAccessible(true);
        field.set(targetObject,"niuniu");

        /**
         * 调用 private 方法
         */
        Method privateMethod = targetClass.getDeclaredMethod("privateMethod");
        //为了调用private方法我们取消安全检查
        privateMethod.setAccessible(true);
        privateMethod.invoke(targetObject);
    }
}
