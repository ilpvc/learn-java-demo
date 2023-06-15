package com.example.demo.IOdemo;

import lombok.extern.slf4j.Slf4j;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Description:
 *
 * @date:2023/6/15 14:31
 * @author: ilpvc
 */
@Slf4j
public class FileReaderDemo {

    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("D:\\static\\file\\ceshi.txt");
        log.info("第一个字符为：{}",(char) fileReader.read());

        fileReader.close();
    }
}
