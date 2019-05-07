package com.lambda.orders.service;

import com.lambda.orders.model.Customer;
import com.lambda.orders.model.Order;
import com.lambda.orders.repos.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "customerService")
public class CustomerServiceImpl implements CustomerService
{
    @Autowired
    private CustomerRepository custrepo;
    
    @Override
    public List<Customer> findAll()
    {
        ArrayList<Customer> list = new ArrayList<>();
        custrepo.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
    
    @Override
    public List<Order> findOrdersByCustomerName()
    {
        return null;
    }
    
    @Override
    public Customer save(Customer customer)
    {
        return null;
    }
    
    @Override
    public Customer findCustomerByCode(long custcode)
    {
        return null;
    }
    
    @Override
    public void delete(long custcode)
    {
    
    }
    
    @Override
    public Customer update(Customer customer, long custcode)
    {
        return null;
    }
}
