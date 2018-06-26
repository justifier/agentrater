package com.agent.rater.configuration;

import com.agent.rater.endpoint.AgentEndpoint;
import com.agent.rater.handler.agent.CreateAgentHandler;
import com.agent.rater.handler.agent.implementations.CreateAgentHandlerImpl;
import com.agent.rater.mediator.agent.CreateAgentMediator;
import com.agent.rater.mediator.agent.implementations.CreateAgentMediatorImpl;
import com.agent.rater.service.agent.CreateAgentService;
import com.agent.rater.service.agent.implementations.CreateAgentServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AgentConfiguration {

    @Bean
    public AgentEndpoint agentEndpoint() {
        return new AgentEndpoint();
    }

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
