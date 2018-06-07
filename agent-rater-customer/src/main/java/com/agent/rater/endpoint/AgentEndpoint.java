package com.agent.rater.endpoint;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/agent")
public class AgentEndpoint {

    @PostMapping("/create")
    public String createAgent()
    {
        throw new RuntimeException("Agent creation not implemented");
    }

}
