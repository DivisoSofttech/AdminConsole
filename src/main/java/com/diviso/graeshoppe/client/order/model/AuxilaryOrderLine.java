package com.diviso.graeshoppe.client.order.model;


import java.io.Serializable;
import java.util.Objects;

/**
 * A AuxilaryOrderLine.
 */


public class AuxilaryOrderLine implements Serializable {

    private static final long serialVersionUID = 1L;
    

    private Long id;

    private OrderLine orderLine;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrderLine getOrderLine() {
        return orderLine;
    }

    public AuxilaryOrderLine orderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
        return this;
    }

    public void setOrderLine(OrderLine orderLine) {
        this.orderLine = orderLine;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AuxilaryOrderLine auxilaryOrderLine = (AuxilaryOrderLine) o;
        if (auxilaryOrderLine.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), auxilaryOrderLine.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "AuxilaryOrderLine{" +
            "id=" + getId() +
            "}";
    }
}
