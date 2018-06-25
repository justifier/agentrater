package com.agent.rater.handler.login.implementations;

import com.agent.rater.handler.login.LoginHandler;
import com.agent.rater.mediator.login.LoginMediator;
import org.springframework.beans.factory.annotation.Autowired;
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
