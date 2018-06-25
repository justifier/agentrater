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
public class Agent extends Customer {

    public Agent(String agencyName, String managerName, String username, String email, String address, String town,
                 String county, String eircode, UserCredentials userCredentials) {
        super(username, email, address, town, county, eircode, UserType.AGENT, userCredentials);
        this.agencyName = agencyName;
        this.managerName = managerName;
    }

    private String agencyName;
    private String managerName;
}
