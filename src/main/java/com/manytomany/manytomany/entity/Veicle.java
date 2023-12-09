package com.manytomany.manytomany.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Collection;

import lombok.*;

@Data
@Entity
@Table(name = "veicle")
public class Veicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long veicleId;
    String name;
    @OneToMany(mappedBy = "veicle", cascade = CascadeType.ALL)
    Collection<Sale> sales;
}