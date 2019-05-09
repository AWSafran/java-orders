package com.lambda.orders.service;

import com.lambda.orders.model.Order;

import java.util.List;

public interface OrderService
{
    List<Order> findOrdersByCustomer(long custcode);
    
    void delete(long custcode);
}
