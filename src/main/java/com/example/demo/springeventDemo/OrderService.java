package com.example.demo.springeventDemo;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @date:2023/9/13 14:54
 * @author: ilpvc
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class OrderService {

    private final ApplicationContext applicationContext;


    public String buyOrder(String orderId){
        long start = System.currentTimeMillis();
        // 1.查询订单详情
        // 2.检验订单价格 （同步处理）
        applicationContext.publishEvent(new OrderProductEvent(this, orderId));
        // 3.短信通知（异步处理）
        long end = System.currentTimeMillis();
        log.info("任务全部完成，总耗时：({})毫秒", end - start);
        return "购买成功";
    }
}
