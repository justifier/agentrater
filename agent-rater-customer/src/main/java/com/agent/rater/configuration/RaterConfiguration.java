package com.agent.rater.configuration;

import com.agent.rater.endpoint.RaterEndpoint;
import com.agent.rater.handler.rater.CreateRaterHandler;
import com.agent.rater.handler.rater.implementations.CreateRaterHandlerImpl;
import com.agent.rater.mediator.rater.CreateRaterMediator;
import com.agent.rater.mediator.rater.implementations.CreateRaterMediatorImpl;
import com.agent.rater.service.rater.CreateRaterService;
import com.agent.rater.service.rater.implementations.CreateRaterServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RaterConfiguration {

    @Bean
    public RaterEndpoint raterEndpoint() {
        return new RaterEndpoint();
    }

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
