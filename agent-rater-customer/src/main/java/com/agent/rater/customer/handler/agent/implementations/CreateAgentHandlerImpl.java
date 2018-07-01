package com.agent.rater.customer.handler.agent.implementations;

import com.agent.rater.customer.handler.agent.CreateAgentHandler;
import com.agent.rater.customer.mediator.agent.CreateAgentMediator;
import com.agent.rater.model.users.Agent;

public class CreateAgentHandlerImpl implements CreateAgentHandler {

    private CreateAgentMediator createAgentMediator;

    public CreateAgentHandlerImpl(CreateAgentMediator createAgentMediator)
    {
        this.createAgentMediator = createAgentMediator;
    }

    @Override
    public String createAgent(Agent agent) {
        return createAgentMediator.createAgent(agent);
    }
}
