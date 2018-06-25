package com.agent.rater.handler;

import com.agent.rater.mediator.login.implementations.LoginMediatorImpl;
import com.agent.rater.testConfiguration.CustomerTestConfiguration;
import com.agent.rater.handler.login.implementations.LoginHandlerImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CustomerTestConfiguration.class)
public class LoginHandlerImplTest {

    @MockBean
    private LoginMediatorImpl loginMediator;

    @Autowired
    private LoginHandlerImpl loginHandler;

    @Test
    public void login()
    {
        when(loginMediator.login())
                .thenReturn("success");

        String loginResponse = loginHandler.login();

        assertEquals("email", loginResponse);
    }
}