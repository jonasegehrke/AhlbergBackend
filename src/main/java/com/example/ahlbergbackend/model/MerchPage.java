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
public class MerchPage {

    @Id
    private int merchPageId;
    private String headline;
}
