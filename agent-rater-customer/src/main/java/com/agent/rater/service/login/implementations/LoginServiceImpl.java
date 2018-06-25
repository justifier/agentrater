package com.agent.rater.service.login.implementations;

import com.agent.rater.dao.CustomerDao;
import com.agent.rater.model.Customer;
import com.agent.rater.service.login.LoginService;
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
