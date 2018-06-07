package com.agent.rater.handler.login.implementations;

import com.agent.rater.handler.login.LoginHandler;
import com.agent.rater.mediator.LoginMediator;
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
