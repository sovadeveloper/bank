package com.sovadeveloper.depositService.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "rate_type")
public class RateType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "percent", nullable = false)
    private int percent;

    @OneToOne(mappedBy = "rateType", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Deposit deposit;
}
