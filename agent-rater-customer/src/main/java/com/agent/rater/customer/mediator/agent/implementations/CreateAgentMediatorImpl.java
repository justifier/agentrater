package com.agent.rater.customer.mediator.agent.implementations;

import com.agent.rater.customer.mediator.agent.CreateAgentMediator;
import com.agent.rater.customer.service.agent.CreateAgentService;
import com.agent.rater.model.users.Agent;

public class CreateAgentMediatorImpl implements CreateAgentMediator {

    private CreateAgentService createAgentService;

    public CreateAgentMediatorImpl(CreateAgentService createAgentService)
    {
        this.createAgentService = createAgentService;
    }

    @Override
    public String createAgent(Agent agent) {
        return createAgentService.createAgent(agent);
    }
}
