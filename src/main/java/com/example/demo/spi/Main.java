package com.example.demo.spi;


/**
 * Description:
 *
 * @date:2023/6/28 15:27
 * @author: ilpvc
 */
public class Main {
    public static void main(String[] args) {

        LoggerService loggerService = LoggerService.getService();

        loggerService.info("ceshiyixai");
    }
}
