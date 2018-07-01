package com.agent.rater.reviews.mediator.implementations;

import com.agent.rater.model.reviews.Review;
import com.agent.rater.reviews.mediator.CreateReviewMediator;
import com.agent.rater.reviews.service.CreateReviewService;

public class CreateReviewMediatorImpl implements CreateReviewMediator {

    private CreateReviewService createReviewService;

    public CreateReviewMediatorImpl(CreateReviewService createReviewService)
    {
        this.createReviewService = createReviewService;
    }

    @Override
    public String create(Review review) {
        return createReviewService.create(review);
    }
}
