package com.agent.rater.customer.mediator.login.implementations;

import com.agent.rater.customer.mediator.login.LoginMediator;
import com.agent.rater.customer.service.login.LoginService;
import org.springframework.stereotype.Component;

@Component
public class LoginMediatorImpl implements LoginMediator {

    private LoginService loginService;

    public LoginMediatorImpl(LoginService loginService)
    {
        this.loginService = loginService;
    }

    @Override
    public String login() {
        return loginService.login();
    }
}
