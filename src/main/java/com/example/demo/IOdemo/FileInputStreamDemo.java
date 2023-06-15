package com.example.demo.IOdemo;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.util.Arrays;

/**
 * Description:
 *
 * @date:2023/6/15 14:10
 * @author: ilpvc
 */

@Slf4j
public class FileInputStreamDemo {


    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("D:\\static\\file\\ceshi.txt");
            BufferedInputStream bf = new BufferedInputStream(inputStream);
            log.info("字节数目：{}",inputStream.available());
//            log.info("下一个字节的数据（ASCII码）：{}",inputStream.read());
            log.info("下一个字节的数据：{}",(char) inputStream.read());
            byte[] bytes = new byte[1024];
            String content = new String(bf.readAllBytes());
            log.info("文件内容是：{}",content);
//            inputStream.read(bytes);
            inputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
