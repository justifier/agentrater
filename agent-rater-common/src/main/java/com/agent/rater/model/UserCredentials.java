package com.agent.rater.model;

import com.agent.rater.enums.RoleType;
import lombok.AllArgsConstructor;
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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserCredentials {

    @Id
    private String username;
    private String password;
    private RoleType role;
}
