package com.agent.rater.customer.configuration;

import com.agent.rater.customer.endpoint.RaterEndpoint;
import com.agent.rater.customer.handler.rater.CreateRaterHandler;
import com.agent.rater.customer.handler.rater.implementations.CreateRaterHandlerImpl;
import com.agent.rater.customer.mediator.rater.CreateRaterMediator;
import com.agent.rater.customer.mediator.rater.implementations.CreateRaterMediatorImpl;
import com.agent.rater.customer.service.rater.CreateRaterService;
import com.agent.rater.customer.service.rater.implementations.CreateRaterServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RaterConfiguration {

    @Bean
    public CreateRaterHandler createRaterHandler() {
        return new CreateRaterHandlerImpl(createRaterMediator());
    }

    @Bean
    public CreateRaterMediator createRaterMediator() {
        return new CreateRaterMediatorImpl(createRaterService());
    }

    @Bean
    public CreateRaterService createRaterService() {
        return new CreateRaterServiceImpl();
    }
}
