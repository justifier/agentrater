package com.agent.rater.reviews.endpoint;

import com.agent.rater.model.reviews.Review;
import com.agent.rater.reviews.handler.CreateReviewHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewEndpoint {

    @Autowired
    private CreateReviewHandler createReviewHandler;

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/create")
    public String create(@RequestBody Review review)
    {
        log.error(review.toString());
        return createReviewHandler.create(review);
    }
}
