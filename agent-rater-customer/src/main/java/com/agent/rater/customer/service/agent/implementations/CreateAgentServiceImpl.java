package com.agent.rater.customer.service.agent.implementations;

import com.agent.rater.customer.service.agent.CreateAgentService;
import com.agent.rater.dao.users.AgentDao;
import com.agent.rater.model.users.Agent;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateAgentServiceImpl implements CreateAgentService {

    @Autowired
    private AgentDao agentDao;

    @Override
    public String createAgent(Agent agent) {
        Agent resultingAgent = agentDao.save(agent);
        return resultingAgent.getUsername();
    }
}
