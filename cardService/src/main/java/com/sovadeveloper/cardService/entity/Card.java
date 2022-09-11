package com.sovadeveloper.cardService.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "passport", nullable = false)
    private String passport;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "number", nullable = false)
    private Long number;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "cvv", nullable = false)
    private int cvv;

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    private CardType cardType;
}
