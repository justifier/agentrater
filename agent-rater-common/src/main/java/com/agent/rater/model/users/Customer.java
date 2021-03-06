package com.agent.rater.model.users;

import com.agent.rater.model.credentials.UserCredentials;
import com.agent.rater.model.reviews.Review;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(uniqueConstraints =
@UniqueConstraint(columnNames = {"username"})
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

    @Id
    private String username;

    private String email;
    private String address;
    private String town;
    private String county;
    private String eircode;

    @OneToOne(cascade = CascadeType.ALL)
    private UserCredentials credentials;

    @Override
    public String toString() {
        return "[" + address + "," + eircode + "," + email + "," + credentials.getUsername() + "]";
    }
}
