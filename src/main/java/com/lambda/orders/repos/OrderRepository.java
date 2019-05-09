package com.lambda.orders.repos;

import com.lambda.orders.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long>
{
}
