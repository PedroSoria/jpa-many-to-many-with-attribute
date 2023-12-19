package com.manytomany.manytomany.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Collection;

import lombok.*;

@Entity
@Data
@Table(name = "customer")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long customerId;
    String name;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    Collection<Sale> sales;
}