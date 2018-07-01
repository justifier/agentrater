package com.agent.rater.model.users;

import com.agent.rater.enums.RoleType;
import com.agent.rater.model.credentials.UserCredentials;
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
                 String county, String eircode,  UserCredentials credentials)
    {
        super(username, email, address, town, county, eircode, credentials);
        super.getCredentials().setRole(RoleType.RATER);
        this.firstname = firstname;
        this.lastname = lastname;
    }

    private String firstname;
    private String lastname;
}
