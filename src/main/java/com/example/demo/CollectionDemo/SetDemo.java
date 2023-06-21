package com.example.demo.CollectionDemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

/**
 * Description:
 *
 * @date:2023/6/21 23:19
 * @author: ilpvc
 */
public class SetDemo {

    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(5);
        hashSet.add(4);
        treeSet.add(1);
        System.out.println(hashSet.contains(3));
        System.out.println(hashSet);
        System.out.println(treeSet);

    }
}
