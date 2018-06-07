package com.agent.rater.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(uniqueConstraints =
    @UniqueConstraint(columnNames = {"username"})
)
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String role;
    private String address;
    private String username;
    private String town;
    private String county;
    private String eircode;
    private String email;
    private String password;

    public Customer() {
    }

    public Customer(String username, String role, String town, String county, String eircode, String email, String password) {
        this.username = username;
        this.role = role;
        this.town = town;
        this.county = county;
        this.eircode = eircode;
        this.email = email;
        this.password = password;
    }

    @Override
    public String toString() {
        return "[" + address + "," + eircode + "," + email + "]";
    }
}
