package com.agent.rater.mediator.login.implementations;

import com.agent.rater.mediator.login.LoginMediator;
import com.agent.rater.service.login.LoginService;
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
