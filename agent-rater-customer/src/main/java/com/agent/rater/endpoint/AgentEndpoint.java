package com.agent.rater.endpoint;

import com.agent.rater.handler.agent.CreateAgentHandler;
import com.agent.rater.model.Agent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agent")
public class AgentEndpoint {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CreateAgentHandler createAgentHandler;

    @PostMapping("/create")
    public String createAgent(@RequestBody Agent agent)
    {
        log.error(agent.toString());
        return createAgentHandler.createAgent(agent);
    }

}
