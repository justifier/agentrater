package com.agent.rater.dao.users;

import com.agent.rater.model.users.Agent;

public interface AgentDao extends GenericCustomerDao<Agent> {

    Agent findFirstByAgencyName(String agencyName);
}
