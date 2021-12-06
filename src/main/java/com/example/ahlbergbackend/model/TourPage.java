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

public class TourPage {
    @Id
    private int tourPageId;
    private String headline;
}


