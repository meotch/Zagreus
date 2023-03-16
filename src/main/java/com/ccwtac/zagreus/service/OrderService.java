package com.ccwtac.zagreus.service;

import com.ccwtac.zagreus.model.Order;
import org.springframework.validation.annotation.Validated;

@Validated
public interface OrderService {
    Iterable<Order> getAllOrders();

    Order create(Order order);

    void update(Order order);
}
