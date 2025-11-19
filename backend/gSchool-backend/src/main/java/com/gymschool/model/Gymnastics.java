package com.gymschool.model;

import jakarta.persistence.*;

@Entity
public class Gymnastics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "type")
    private String name; // Aesthetic-Gymnastics, Art-Gymnastic

    @Column
    private String description;
}
