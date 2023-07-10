package com.example.demo.NIODemo;

import java.nio.CharBuffer;

/**
 * Description:
 *
 * @date:2023/7/8 21:43
 * @author: ilpvc
 */
public class CharBufferDemo {

    public static void main(String[] args) {

        CharBuffer charBuffer = CharBuffer.allocate(8);
        System.out.println("初始状态：");
        printState(charBuffer);

        charBuffer.put('i').put(' ').put('l').put('o').put('v').put('e');
        System.out.println("写入了i love之后");
        printState(charBuffer);

        //调用flip方法，读取charBuffer的值
        charBuffer.flip();
        System.out.println("调用flip方法之后");
        printState(charBuffer);

        // 读取字符
        while (charBuffer.hasRemaining()){
            System.out.println(charBuffer.get()+" ");
        }

        // 调用clear()方法，清空缓冲区，将 position 的值置为 0，将 limit 的值置为 capacity 的值
        charBuffer.clear();
        System.out.println("调用clear()方法后的状态：");
        printState(charBuffer);

    }

    // 打印buffer的capacity、limit、position、mark的位置
    private static void printState(CharBuffer buffer) {
        System.out.print("capacity: " + buffer.capacity());
        System.out.print(", limit: " + buffer.limit());
        System.out.print(", position: " + buffer.position());
        System.out.print(", mark 开始读取的字符: " + buffer.mark());
        System.out.println("\n");
    }
}
