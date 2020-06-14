package com.example.onetoone.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
@Data
public class Person {
    /**
     * 关系的拥有端存储一个被控端的一个外键。
     * 在这个例子中 Person表 中的 address_id 就是指向 address表 的一个外键，
     * 缺省情况下这个外键的字段名称，是以它指向的表的名称加下划线“_”加“id”组成的。
     * 当然我们也可以根据我们的喜好来修改这个字段，修改的办法就是使用 @JoinColumn 这个注解。
     * 在这个例子中我们可以将这个注解标注在 Person 类中的 Address 属性上去。
     */
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    @OneToOne
    private Address address;
}