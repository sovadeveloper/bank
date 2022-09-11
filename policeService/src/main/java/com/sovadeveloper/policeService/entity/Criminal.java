package com.sovadeveloper.policeService.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "criminal")
public class Criminal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "passport", nullable = false)
    private String passport;

    @ManyToOne
    @JoinColumn(name = "crime_id")
    private Crime crime;
}
