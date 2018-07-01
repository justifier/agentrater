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
public class Agent extends Customer {

    public Agent(String agencyName, String managerName, String username, String email, String address, String town,
                 String county, String eircode, UserCredentials credentials) {
        super(username, email, address, town, county, eircode, credentials);
        super.getCredentials().setRole(RoleType.AGENT);
        this.agencyName = agencyName;
        this.managerName = managerName;
    }

    private String agencyName;
    private String managerName;
}
