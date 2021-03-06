package com.agent.rater.dao.users;

import com.agent.rater.model.users.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface GenericCustomerDao<T extends Customer> extends CrudRepository<T, Long> {

    T findFirstByUsername(String user);
}
