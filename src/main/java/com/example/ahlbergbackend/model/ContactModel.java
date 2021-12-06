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
public class ContactModel {

    @Id
    private int contactId;
    private String contactHeadline;
    private String contactDescription;
    private String email;
}
