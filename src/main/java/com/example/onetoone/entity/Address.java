package com.example.onetoone.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Address {
    /**
     * mappedBy = (Optional) The field that owns the relationship，即指向拥有端的(变量名).
     */
    @Id
    private Long id;
    private String state;
    private String city;
    private String street;
    private String zipCode;
    @JsonIgnore
    @OneToOne(mappedBy = "address") // 要么拆掉双向关系，要么使用@JsonIgnore，否则序列化会产生
    private Person person;
}