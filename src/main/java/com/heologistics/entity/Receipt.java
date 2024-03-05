package com.heologistics.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Receipt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int receiptNumber;

    @Column(name = "CAR_TYPE")
    private String carType;
    private String price;
    private String distance;

    @Column(name = "DELIVERY_ADDRESS")
    private String deliveryAddress;
    @Column(name = "DELIVERY_DATE")
    private String deliveryDate;
}
