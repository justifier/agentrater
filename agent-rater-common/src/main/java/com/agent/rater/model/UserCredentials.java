package com.agent.rater.model;

import com.agent.rater.enums.RoleType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints =
@UniqueConstraint(columnNames = {"username"})
)
@NoArgsConstructor
@Getter
@Setter
public class UserCredentials {

    public UserCredentials(String username, String password)
    {
        this.username = username;
        this.password = password;
        this.role = RoleType.DEFAULT_CUSTOMER;
    }

    @Id
    private String username;
    private String password;
    private RoleType role;
}
