package com.diviso.graeshoppe.client.administration.model;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;


import java.io.Serializable;
import java.time.Instant;

/**
 * A Feedback.
 */

public class Feedback implements Serializable {

    private static final long serialVersionUID = 1L;


    private Long id;


    private String ticketId;

 
    private String query;

 
    private String subject;

 
    private String customerEmail;

 
    private Instant date;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTicketId() {
        return ticketId;
    }

    public Feedback ticketId(String ticketId) {
        this.ticketId = ticketId;
        return this;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public String getQuery() {
        return query;
    }

    public Feedback query(String query) {
        this.query = query;
        return this;
    }

    public void setQuery(String query) {
        this.query = query;
    }

    public String getSubject() {
        return subject;
    }

    public Feedback subject(String subject) {
        this.subject = subject;
        return this;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public Feedback customerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
        return this;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public Instant getDate() {
        return date;
    }

    public Feedback date(Instant date) {
        this.date = date;
        return this;
    }

    public void setDate(Instant date) {
        this.date = date;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Feedback)) {
            return false;
        }
        return id != null && id.equals(((Feedback) o).id);
    }

    @Override
    public int hashCode() {
        return 31;
    }

    @Override
    public String toString() {
        return "Feedback{" +
            "id=" + getId() +
            ", ticketId='" + getTicketId() + "'" +
            ", query='" + getQuery() + "'" +
            ", subject='" + getSubject() + "'" +
            ", customerEmail='" + getCustomerEmail() + "'" +
            ", date='" + getDate() + "'" +
            "}";
    }
}
