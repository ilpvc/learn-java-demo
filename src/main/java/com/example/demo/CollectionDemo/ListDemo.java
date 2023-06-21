package com.example.demo.CollectionDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Vector;

/**
 * Description:
 *
 * @date:2023/6/21 23:23
 * @author: ilpvc
 */
public class ListDemo {

    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList("tom", "cat"));
        LinkedList<String > linkedList = new LinkedList<>(Arrays.asList("wanglan","liuxing"));
        Vector<Integer> vector = new Vector<>();
        for (int i=0;i<50;i++) vector.add(i);
        VectorDemo vectorDemo = new VectorDemo(vector);
        Thread thread = new Thread(vectorDemo);
        Thread thread1 =new Thread(vectorDemo);
        thread1.start();
        thread.start();
        System.out.println(linkedList.offer("wanglan"));
        System.out.println(arrayList);
    }

    static class VectorDemo implements Runnable{

        VectorDemo(Vector<Integer> vector){
            this.vector = vector;
        }
        Vector<Integer> vector;

        @Override
        public void run() {
            for (int v=0;v<=20;v++) {
                System.out.println(vector.get(v)+"前");
                vector.set(v,3);
                System.out.println(vector.get(v)+"后");
            }

        }



    }
}
