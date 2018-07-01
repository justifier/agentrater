package com.agent.rater.customer.mediator.rater.implementations;

import com.agent.rater.customer.mediator.rater.CreateRaterMediator;
import com.agent.rater.customer.service.rater.CreateRaterService;
import com.agent.rater.model.users.Rater;

public class CreateRaterMediatorImpl implements CreateRaterMediator {

    private CreateRaterService createRaterService;

    public CreateRaterMediatorImpl(CreateRaterService createRaterService) {
        this.createRaterService = createRaterService;
    }

    @Override
    public String create(Rater rater) {
        return createRaterService.create(rater);
    }
}
