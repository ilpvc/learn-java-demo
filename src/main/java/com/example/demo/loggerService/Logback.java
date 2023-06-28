package com.example.demo.loggerService;

import com.example.demo.spi.Logger;

/**
 * Description:
 *
 * @date:2023/6/28 15:30
 * @author: ilpvc
 */
public class Logback implements Logger {
    @Override
    public void info(String msg) {
        System.out.println("Logback 的 info:"+msg);
    }

    @Override
    public void debug(String msg) {
        System.out.println("Logback 的 debug:"+msg);
    }
}
