package com.agent.rater.handler.agent.implementations;

import com.agent.rater.handler.agent.CreateAgentHandler;
import com.agent.rater.mediator.agent.CreateAgentMediator;
import com.agent.rater.model.Agent;

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
