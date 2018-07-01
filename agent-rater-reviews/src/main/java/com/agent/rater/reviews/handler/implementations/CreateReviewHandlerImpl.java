package com.agent.rater.reviews.handler.implementations;

import com.agent.rater.model.reviews.Review;
import com.agent.rater.reviews.handler.CreateReviewHandler;
import com.agent.rater.reviews.mediator.CreateReviewMediator;

public class CreateReviewHandlerImpl implements CreateReviewHandler {

    private CreateReviewMediator createReviewMediator;

    public CreateReviewHandlerImpl(CreateReviewMediator createReviewMediator)
    {
        this.createReviewMediator = createReviewMediator;
    }

    @Override
    public String create(Review review) {
        return createReviewMediator.create(review);
    }
}
