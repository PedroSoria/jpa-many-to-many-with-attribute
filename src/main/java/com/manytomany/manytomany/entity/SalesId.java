package com.manytomany.manytomany.entity;

import jakarta.persistence.*;
import java.io.Serializable;

@Embeddable
public class SalesId implements Serializable {
    private Long veicleId;
    private Long customerId;

    public Long getVeicleId() {
        return veicleId;
    }

    public void setVeicleId(Long veicleId) {
        this.veicleId = veicleId;
    }

    public Long getProductoId() {
        return customerId;
    }

    public void setProductoId(Long productoId) {
        this.customerId = productoId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((veicleId == null) ? 0 : veicleId.hashCode());
        result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SalesId other = (SalesId) obj;
        if (veicleId == null) {
            if (other.veicleId != null)
                return false;
        } else if (!veicleId.equals(other.veicleId))
            return false;
        if (customerId == null) {
            if (other.customerId != null)
                return false;
        } else if (!customerId.equals(other.customerId))
            return false;
        return true;
    }

}