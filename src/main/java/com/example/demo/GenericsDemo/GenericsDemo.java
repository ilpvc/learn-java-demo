package com.example.demo.GenericsDemo;

import java.util.ArrayList;

/**
 * Description:
 *
 * @date:2023/6/28 10:29
 * @author: ilpvc
 */
public class GenericsDemo {
    public static void main(String[] args) {
        People<Integer> people = new People<>();
//        People<String> people = new People<>();
//        people.setObj("name: jeck");
        people.setObj(19191919);
        people.getAndPrintObj();

        Integer[] integersList = {1,2,3};
        String[] strings = {"ilpvc","colzry","isir"};

        People.printArrays(integersList);
        People.printArrays(strings);
    }

}
