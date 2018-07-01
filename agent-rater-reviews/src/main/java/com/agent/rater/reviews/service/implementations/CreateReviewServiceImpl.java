package com.agent.rater.reviews.service.implementations;

import com.agent.rater.dao.reviews.ReviewDao;
import com.agent.rater.model.reviews.Review;
import com.agent.rater.reviews.service.CreateReviewService;
import org.springframework.beans.factory.annotation.Autowired;

public class CreateReviewServiceImpl implements CreateReviewService {

    @Autowired
    private ReviewDao reviewDao;

    @Override
    public String create(Review review) {
        Review savedReview = reviewDao.save(review);
        return savedReview.getAgency_id();
    }
}
