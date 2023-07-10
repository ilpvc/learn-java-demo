package com.example.demo.NIODemo;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Description:
 *
 * @date:2023/7/8 22:41
 * @author: ilpvc
 */
public class FileChannelDemo {

    public static void main(String[] args) throws IOException {
        RandomAccessFile reader = new RandomAccessFile("E:\\IDEA project\\demo1\\src\\main\\java\\com\\example\\demo\\NIODemo\\text.ini","r");
        FileChannel channel = reader.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        channel.read(buffer);

    }
}
