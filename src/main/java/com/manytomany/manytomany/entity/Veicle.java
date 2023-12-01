package com.manytomany.manytomany.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import lombok.*;

@Data
@Entity
@Table(name = "veicle")
public class Veicle implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String name;
    @OneToMany(mappedBy = "veicle", cascade = CascadeType.ALL)
    private Collection<Sale> sales = new ArrayList<>();
}