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
public class Tour {

    @Id
    @Generated
    private int tourId;
    private String date;
    private String time;
    private String city;
    private int ticketPrice;

}
