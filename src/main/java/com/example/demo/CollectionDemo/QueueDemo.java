package com.example.demo.CollectionDemo;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Description:
 *
 * @date:2023/6/21 23:46
 * @author: ilpvc
 */
public class QueueDemo {

    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(1);
        priorityQueue.add(4);
        priorityQueue.add(5);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.poll());


        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.addFirst(1);
        arrayDeque.addLast(5);
        arrayDeque.pop();
        arrayDeque.pop();
        System.out.println(arrayDeque);

    }
}
