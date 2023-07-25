package com.example.restaurantefinal.entities;

import jakarta.persistence.*;

@Entity
@Table (name = "Reclamations")

public class Reclamation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "reclamation_id")

    private Integer id;
    private Integer idOrder;
    private String campus;
    private String state;
    private String reason;

    public Reclamation() {
    }

    public Reclamation(Integer id, Integer idOrder, String campus, String state, String reason) {
        this.id = id;
        this.idOrder = idOrder;
        this.campus = campus;
        this.state = state;
        this.reason = reason;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdOrder() {
        return idOrder;
    }

    public void setIdOrder(Integer idOrder) {
        this.idOrder = idOrder;
    }

    public String getCampus() {
        return campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
