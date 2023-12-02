package com.manytomany.manytomany.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import lombok.*;

@Entity
@Data
@Table(name = "customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    String name;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Collection<Sale> sales = new ArrayList<>();
}