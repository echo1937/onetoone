package com.example.onetoone.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Student {

    @Id
    private Long id;
    private String name;
    @Column(name = "phone_id")
    private Long phone;

}
