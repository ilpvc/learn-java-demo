package com.example.demo;

import com.example.demo.springeventDemo.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Description:
 *
 * @date:2023/9/13 14:59
 * @author: ilpvc
 */
@SpringBootTest
public class SpringEventDemoTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void buyOrderTest() {
        orderService.buyOrder("732171109");
    }
}
