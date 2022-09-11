package com.sovadeveloper.bankService.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "passport", nullable = false)
    private String passport;

    @Column(name = "description", nullable = false)
    private String description;
}
