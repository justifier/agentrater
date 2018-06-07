package com.agent.rater.endpoint;

import com.agent.rater.handler.rater.CreateRaterHandler;
import com.agent.rater.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rater")
public class RaterEndpoint {

    @Autowired
    private CreateRaterHandler createRaterHandler;

    @PostMapping("/create")
    public String createRater(Customer customer)
    {
        return createRaterHandler.create(customer);
    }
}
