package com.example.demo.CollectionDemo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * Description:
 *
 * @date:2023/6/21 23:51
 * @author: ilpvc
 */
public class MapDemo {

    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"yangdawei");
        hashMap.put(2,"panlei");
        Hashtable<Integer,String> hashtable = new Hashtable<>();
        LinkedHashMap<Integer,String > linkedHashMap = new LinkedHashMap<>();
        TreeMap<Integer,String> treeMap = new TreeMap<>();
        System.out.println(hashMap);

    }
}
