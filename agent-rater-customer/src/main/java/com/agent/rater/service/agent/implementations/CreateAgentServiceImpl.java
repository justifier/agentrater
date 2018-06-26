package com.agent.rater.service.agent.implementations;

import com.agent.rater.dao.AgentDao;
import com.agent.rater.model.Agent;
import com.agent.rater.service.agent.CreateAgentService;
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
