package com.yasirmaulana.ims.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Shipment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @Column(nullable = false)
    private LocalDate shippingDate;

    @Column(nullable = false)
    private String carrier;

    @Column(name = "tracking_number", nullable = false)
    private String trackingNumber;
}
