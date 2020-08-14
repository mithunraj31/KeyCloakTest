package com.pj.keycloak.model;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "device")
@Data
public class Device implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = -5915681124947660889L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "deviceId")
    private int deviceId;

    @ManyToOne
	@JoinColumn(name="user_id", nullable=false)
    private User owner;

    @ManyToOne
	@JoinColumn(name="customer_id", nullable=false)
    private Customer customer;

    @ManyToOne
	@JoinColumn(name="group_id", nullable=false)
    private Group group;

    @Column(name = "createdAt")
    private Timestamp createdAt;

    @Column(name = "updatedAt")
    private Timestamp updatedAt;

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    
}