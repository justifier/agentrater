package com.agent.rater.dao;

import com.agent.rater.model.users.Agent;

public interface AgentDao extends GenericCustomerDao<Agent> {

    Agent findFirstByAgencyName(String agencyName);
}
