package com.shangruey.springbootmall.service;

import com.shangruey.springbootmall.dto.CreateOrderRequest;
import com.shangruey.springbootmall.model.Order;

public interface OrderService {

    Order getOrderById(Integer orderId);

    Integer createOrder(Integer userId, CreateOrderRequest createOrderRequest);
}
