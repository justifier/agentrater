package com.agent.rater.customer.handler.rater.implementations;

import com.agent.rater.customer.handler.rater.CreateRaterHandler;
import com.agent.rater.customer.mediator.rater.CreateRaterMediator;
import com.agent.rater.model.users.Rater;
import org.springframework.stereotype.Component;

@Component
public class CreateRaterHandlerImpl implements CreateRaterHandler {

    private CreateRaterMediator createRaterMediator;

    public CreateRaterHandlerImpl(CreateRaterMediator createRaterMediator)
    {
        this.createRaterMediator = createRaterMediator;
    }

    @Override
    public String create(Rater rater) {
        validateCustomer(rater);
        return createRaterMediator.create(rater);
    }

    private void validateCustomer(Rater rater)
    {

    }
}
