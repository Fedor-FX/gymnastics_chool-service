package com.gymschool.model;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class MembershipPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String type; //3months, 6months etc.

    @Column
    private BigDecimal amount; //cost of 1 membershipPlan

    @Column
    private int DurationInMonths;

}
