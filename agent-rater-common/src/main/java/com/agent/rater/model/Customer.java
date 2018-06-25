package com.agent.rater.model;

import com.agent.rater.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints =
    @UniqueConstraint(columnNames = {"username"})
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    @Id
    private String username;

    private String email;
    private String address;
    private String town;
    private String county;
    private String eircode;
    private UserType userType;

    @OneToOne(cascade = CascadeType.ALL)
    private UserCredentials credentials;

    @Override
    public String toString() {
        return "[" + address + "," + eircode + "," + email + "]";
    }
}
