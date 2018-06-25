package com.agent.rater.handler.rater.implementations;

import com.agent.rater.handler.rater.CreateRaterHandler;
import com.agent.rater.mediator.rater.CreateRaterMediator;
import com.agent.rater.model.Customer;
import com.agent.rater.model.Rater;
import org.springframework.beans.factory.annotation.Autowired;
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
