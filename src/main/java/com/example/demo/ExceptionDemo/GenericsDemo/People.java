package com.example.demo.ExceptionDemo.GenericsDemo;

/**
 * Description:
 *
 * @date:2023/6/28 10:30
 * @author: ilpvc
 */

public class People<T> {
    private T obj;

    public T getAndPrintObj() {
        System.out.println(obj);
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }


    public static <E> void printArrays(E[] arrays){
        for ( E element : arrays ){
            System.out.printf( "%s ", element );
        }
        System.out.println();
    }


}
