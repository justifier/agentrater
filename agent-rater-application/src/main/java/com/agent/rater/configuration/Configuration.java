package com.agent.rater.configuration;

import com.agent.rater.endpoint.UserEndpoint;
import com.agent.rater.handler.login.LoginHandler;
import com.agent.rater.handler.login.implementations.LoginHandlerImpl;
import com.agent.rater.mediator.LoginMediator;
import com.agent.rater.mediator.implementations.LoginMediatorImpl;
import com.agent.rater.service.LoginService;
import com.agent.rater.service.implementations.LoginServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@org.springframework.context.annotation.Configuration
public class Configuration {

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

    @Bean
    public UserEndpoint userEndpoint()
    {
        return new UserEndpoint(loginHandler());
    }

    @Bean
    public LoginHandler loginHandler()
    {
        return new LoginHandlerImpl(loginMediator());
    }

    @Bean
    public LoginMediator loginMediator()
    {
        return new LoginMediatorImpl(loginService());
    }

    @Bean
    public LoginService loginService()
    {
        return new LoginServiceImpl();
    }
}
