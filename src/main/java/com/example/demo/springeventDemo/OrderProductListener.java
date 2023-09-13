package com.example.demo.springeventDemo;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * Description:
 *
 * @date:2023/9/13 14:50
 * @author: ilpvc
 */
@Slf4j
@Component
public class OrderProductListener implements ApplicationListener<OrderProductEvent> {

    @SneakyThrows
    @Override
    public void onApplicationEvent(OrderProductEvent event) {
        String orderId = event.getOrderId();
        long start = System.currentTimeMillis();
        Thread.sleep(2000);
        long end = System.currentTimeMillis();
        log.info("{}:校验订单商品价格耗时：({})毫秒",orderId,(end-start));

    }
}
