package com.agent.rater.dao;

import com.agent.rater.model.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface GenericCustomerDao<T extends Customer> extends CrudRepository<T, Long> {

    T findFirstByUsername(String user);
}
