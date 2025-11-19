package com.gymschool.model;

import jakarta.persistence.*;

public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "cost")
    private Double cost;

    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;

    @Id
    private Long paymentId;

    @Enumerated(EnumType.STRING)
    private PaymentType paymentType;


}
