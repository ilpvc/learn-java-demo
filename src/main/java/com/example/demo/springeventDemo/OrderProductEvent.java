package com.example.demo.springeventDemo;

import lombok.Data;
import lombok.ToString;
import org.springframework.context.ApplicationEvent;

/**
 * Description:
 *
 * @date:2023/9/13 14:47
 * @author: ilpvc
 */

@ToString
public class OrderProductEvent extends ApplicationEvent {

    private String orderId;

    public OrderProductEvent(Object source,String orderId){
        super(source);
        this.orderId = orderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
}
