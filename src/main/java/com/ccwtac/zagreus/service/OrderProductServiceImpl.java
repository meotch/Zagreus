package com.ccwtac.zagreus.service;

import com.ccwtac.zagreus.model.OrderProduct;
import com.ccwtac.zagreus.repository.OrderProductRepository;

public class OrderProductServiceImpl implements OrderProductService {

    private OrderProductRepository orderProductRepository;

    public OrderProductServiceImpl(OrderProductRepository orderProductRepository) {
        this.orderProductRepository = orderProductRepository;
    }

    @Override
    public OrderProduct create(OrderProduct orderProduct) {
        return this.orderProductRepository.save(orderProduct);
    }
}
