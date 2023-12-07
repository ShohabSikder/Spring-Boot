package com.shohab.SpringBoot55.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity(name = "students")
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Student {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;
    private int roll;
    private String name;
    @Column(unique=true,nullable=false,name="email")
    private String mail;
    private String gender;
    private String subject;
    private Date dob;



}
