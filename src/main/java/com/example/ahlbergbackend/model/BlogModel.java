package com.example.ahlbergbackend.model;



import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@ToString

@Entity
public class BlogModel {

    @Id
    @GeneratedValue
    private int blogId;

    private String blogHeadline;
    private String blogDescription;
    private String blogContent;
}
