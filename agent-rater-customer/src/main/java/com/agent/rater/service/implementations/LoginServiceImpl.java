package com.agent.rater.service.implementations;

import com.agent.rater.dao.LoginDao;
import com.agent.rater.model.Customer;
import com.agent.rater.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginServiceImpl implements LoginService {

    private int test = 1;

    @Autowired
    private LoginDao loginDao;

    private void setupForTesting()
    {
        if(test==1)
    {
        test++;
        loginDao.save(new Customer("ross","Admin","swords","dublin","eir","email","pass"));
        loginDao.save(new Customer("ross1","Agent","swords1","dublin1","eir1","email1","pass1"));
        loginDao.save(new Customer("ross2","Agent","swords2","dublin2","eir2","email2","pass2"));
        loginDao.save(new Customer("ross3","Rater","swords3","dublin3","eir3","email3","pass3"));
        loginDao.save(new Customer("ross4","Rater","swords4","dublin4","eir4","email4","pass4"));
    }
    }

    @Override
    public String login() {
        setupForTesting();
        Customer customer = loginDao.findFirstByUsername("ross");
        return customer.getEmail();
    }
}
