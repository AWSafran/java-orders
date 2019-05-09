package com.lambda.orders.repos;

import com.lambda.orders.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long>
{
    public Customer findByCustname(String name);
}
