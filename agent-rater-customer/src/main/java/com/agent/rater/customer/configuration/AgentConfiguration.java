package com.agent.rater.customer.configuration;

import com.agent.rater.customer.handler.agent.CreateAgentHandler;
import com.agent.rater.customer.handler.agent.implementations.CreateAgentHandlerImpl;
import com.agent.rater.customer.mediator.agent.CreateAgentMediator;
import com.agent.rater.customer.mediator.agent.implementations.CreateAgentMediatorImpl;
import com.agent.rater.customer.service.agent.CreateAgentService;
import com.agent.rater.customer.service.agent.implementations.CreateAgentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgentConfiguration {

    @Bean
    public CreateAgentHandler createAgentHandler() {
        return new CreateAgentHandlerImpl(createAgentMediator());
    }

    @Bean
    public CreateAgentMediator createAgentMediator() {
        return new CreateAgentMediatorImpl(createAgentService());
    }

    @Bean
    public CreateAgentService createAgentService() {
        return new CreateAgentServiceImpl();
    }
}
