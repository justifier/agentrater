package com.agent.rater.reviews.configuration;

import com.agent.rater.reviews.handler.CreateReviewHandler;
import com.agent.rater.reviews.handler.implementations.CreateReviewHandlerImpl;
import com.agent.rater.reviews.mediator.CreateReviewMediator;
import com.agent.rater.reviews.mediator.implementations.CreateReviewMediatorImpl;
import com.agent.rater.reviews.service.CreateReviewService;
import com.agent.rater.reviews.service.implementations.CreateReviewServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ReviewConfiguration {

    @Bean
    public CreateReviewHandler createReviewHandler()
    {
        return new CreateReviewHandlerImpl(createReviewMediator());
    }

    @Bean
    public CreateReviewMediator createReviewMediator()
    {
        return new CreateReviewMediatorImpl(createReviewService());
    }

    @Bean
    public CreateReviewService createReviewService()
    {
        return new CreateReviewServiceImpl();
    }
}
