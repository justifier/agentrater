package com.agent.rater.mediator.agent.implementations;

import com.agent.rater.mediator.agent.CreateAgentMediator;
import com.agent.rater.model.users.Agent;
import com.agent.rater.service.agent.CreateAgentService;

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
