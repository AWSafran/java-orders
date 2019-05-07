package com.lambda.orders.service;

import com.lambda.orders.model.Customer;
import com.lambda.orders.model.Order;

import java.util.List;

public interface CustomerService
{
    List<Customer> findAll();
    
    List<Order> findOrdersByCustomerName();
    
    Customer save(Customer customer);
    
    Customer findCustomerByCode(long custcode);
    
    void delete(long custcode);
    
    Customer update(Customer customer, long custcode);
}
