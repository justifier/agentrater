package com.agent.rater.customer.service.login.implementations;

import com.agent.rater.customer.service.login.LoginService;
import com.agent.rater.dao.users.CustomerDao;
import com.agent.rater.model.users.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginServiceImpl implements LoginService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public String login() {
        Customer customer = customerDao.findFirstByUsername("ross");
        return customer.getEmail();
    }
}
