package com.agent.rater.mediator.implementations;

import com.agent.rater.mediator.LoginMediator;
import com.agent.rater.service.LoginService;
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
