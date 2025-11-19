package com.gymschool.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate startDate;
    private LocalDate expirationDate;

    @OneToOne
    private User user;

    @ManyToOne
    @JoinColumn(name = "membership_id")
    private MembershipPlan membershipPlan;

    @ManyToOne
    @JoinColumn(name = "gymnastics_id")
    private Gymnastics gymnastics; //Выбранный тип гиманстики




}
