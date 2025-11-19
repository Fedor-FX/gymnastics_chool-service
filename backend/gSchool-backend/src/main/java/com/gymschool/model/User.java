package com.gymschool.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String name;

    @Column(name = "password")
    private String password;

    @Column(name = "age")
    private int age;

    @Column(name = "phone_number")
    private String parentPhoneNumber;

    @OneToOne
    private Membership membership;

    public User() {}



}
