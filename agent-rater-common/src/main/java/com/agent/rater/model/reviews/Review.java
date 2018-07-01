package com.agent.rater.model.reviews;

import com.agent.rater.enums.ReviewProgress;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints =
@UniqueConstraint(columnNames = {"id"})
)
@Getter
@Setter
@NoArgsConstructor
public class Review {

    public Review(String reviewer_id, String agency_id, int rating1, int rating2, int rating3, String message) {
        this.reviewer_id = reviewer_id;
        this.agency_id = agency_id;
        this.rating1 = rating1;
        this.rating2 = rating2;
        this.rating3 = rating3;
        this.message = message;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String reviewer_id;
    private String agency_id;
    private int rating1;
    private int rating2;
    private int rating3;
    private String message;
    private ReviewProgress reviewProgress = ReviewProgress.SUBMITTED;
}
