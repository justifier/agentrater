package com.agent.rater.mediator.rater.implementations;

import com.agent.rater.mediator.rater.CreateRaterMediator;
import com.agent.rater.model.Rater;
import com.agent.rater.service.rater.CreateRaterService;

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
