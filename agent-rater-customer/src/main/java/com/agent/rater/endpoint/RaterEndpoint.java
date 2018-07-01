package com.agent.rater.endpoint;

import com.agent.rater.handler.rater.CreateRaterHandler;
import com.agent.rater.model.users.Rater;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rater")
public class RaterEndpoint {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CreateRaterHandler createRaterHandler;

    @PostMapping("/create")
    public String createRater(@RequestBody Rater rater)
    {
        log.info(rater.toString());
        return createRaterHandler.create(rater);
    }
}
