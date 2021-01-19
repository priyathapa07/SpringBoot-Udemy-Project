package com.udemy.springBoot.user.entity;


import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Instructor_Course {
    @Id //(unique identifier vayena vaney compile error)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
}