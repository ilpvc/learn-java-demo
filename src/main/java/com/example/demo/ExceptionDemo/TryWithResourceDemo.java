package com.example.demo.ExceptionDemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Description:
 *
 * @date:2023/6/28 10:07
 * @author: ilpvc
 */
public class TryWithResourceDemo {
    /**
     * 在使用try-with-resource时对于常见的IO类实现，不需要手动关闭即close
     * @param args
     */
    public static void main(String[] args) {
        try (BufferedInputStream bf = new BufferedInputStream(new FileInputStream("E:\\IDEA project\\demo1\\src\\main\\java\\com\\example\\demo\\ExceptionDemo\\ceshi.txt"))) {
            byte[] bytes = new byte[256];
            bf.read(bytes);
            String s = new String(bytes);
            System.out.println(s);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}