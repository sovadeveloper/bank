package com.sovadeveloper.depositService.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "payment_type")
public class PaymentType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "days")
    private int days;

    @OneToOne(mappedBy = "paymentType", cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = false)
    private Deposit deposit;
}
