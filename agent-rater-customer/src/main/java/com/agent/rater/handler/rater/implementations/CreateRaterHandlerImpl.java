package com.agent.rater.handler.rater.implementations;

import com.agent.rater.handler.rater.CreateRaterHandler;
import com.agent.rater.model.Customer;
import org.springframework.stereotype.Component;

@Component
public class CreateRaterHandlerImpl implements CreateRaterHandler {

    @Override
    public String create(Customer customer) {
        validateCustomer(customer);
        return null;
    }

    private void validateCustomer(Customer customer)
    {

    }
}
