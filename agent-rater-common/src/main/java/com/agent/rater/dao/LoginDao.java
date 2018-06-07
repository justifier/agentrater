package com.agent.rater.dao;

import com.agent.rater.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface LoginDao extends CrudRepository<Customer, Long> {
    Customer findFirstByUsername(String user);
}
