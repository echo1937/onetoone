package com.example.onetoone.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class Phone {
    @Id
    private Long id;
    private String phoneNumber;
}
