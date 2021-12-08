package com.example.ahlbergbackend.model;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString

@Entity
public class Login {

    @Id
    private int loginId;
    private String username;
    private String password;
}
