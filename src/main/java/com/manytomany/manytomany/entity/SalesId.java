package com.manytomany.manytomany.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Embeddable
@EqualsAndHashCode
@Data
public class SalesId implements Serializable {
    Long veicleId;
    Long customerId;
}