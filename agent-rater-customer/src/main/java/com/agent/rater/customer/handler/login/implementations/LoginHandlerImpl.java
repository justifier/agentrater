package com.agent.rater.customer.handler.login.implementations;

import com.agent.rater.customer.handler.login.LoginHandler;
import com.agent.rater.customer.mediator.login.LoginMediator;
import org.springframework.stereotype.Component;

@Component
public class LoginHandlerImpl implements LoginHandler {

    private LoginMediator loginMediator;

    public LoginHandlerImpl(LoginMediator loginMediator)
    {
        this.loginMediator = loginMediator;
    }

    @Override
    public String login() {
        return loginMediator.login();
    }
}
