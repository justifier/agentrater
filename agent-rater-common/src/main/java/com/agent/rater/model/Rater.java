package com.agent.rater.model;

import com.agent.rater.enums.UserType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Rater extends Customer {

    public Rater(String firstname, String lastname, String username, String email, String address, String town,
                 String county, String eircode,  UserCredentials userCredentials)
    {
        super(username, email, address, town, county, eircode, UserType.RATER, userCredentials);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    private String firstname;
    private String lastname;
}
