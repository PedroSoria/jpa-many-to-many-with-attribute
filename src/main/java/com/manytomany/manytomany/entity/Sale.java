package com.manytomany.manytomany.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Entity
@Data
@Table(name = "sale")
public class Sale implements Serializable {
    @EmbeddedId
    private SalesId salesId = new SalesId();

    @ManyToOne
    @MapsId("customerId")
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne
    @MapsId("veicleId")
    @JoinColumn(name = "veicle_id")
    private Veicle veicle;

    private int number;

}