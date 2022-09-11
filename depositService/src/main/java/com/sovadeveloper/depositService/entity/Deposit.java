package com.sovadeveloper.depositService.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "deposit")
public class Deposit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "passport", nullable = false)
    private String passport;

    @Column(name = "start_sum", nullable = false)
    private int startSum;

    @Column(name = "current_sum")
    private int currentSum;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "date_start", nullable = false)
    private LocalDate dateStart;

    @Column(name = "date_end", nullable = false)
    private LocalDate dateEnd;

    @Column(name = "capitalization", nullable = false)
    private boolean capitalization;

    @OneToOne(fetch = FetchType.LAZY)
    private RateType rateType;

    @OneToOne(fetch = FetchType.LAZY)
    private PaymentType paymentType;
}
