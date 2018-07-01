package com.agent.rater.dao.reviews;

import com.agent.rater.model.reviews.Review;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ReviewDao extends CrudRepository<Review, Long> {

    Review findFirstById(String id);
}
