package com.lambda.orders.repos;

import com.lambda.orders.model.Agent;
import org.springframework.data.repository.CrudRepository;

public interface AgentRepository extends CrudRepository<Agent, Long>
{
}
