package com.example.ahlbergbackend.model;


import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@Setter
@ToString

@Entity
public class IndexModel {

    @Id
    private int indexModelId;
    private String headline;
    private String description1;
    private String description2;
}
