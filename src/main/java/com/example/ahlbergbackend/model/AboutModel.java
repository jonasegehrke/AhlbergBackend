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
public class AboutModel {

    @Id
    private int aboutModelId;
    private String headline;
    private String description;
}
