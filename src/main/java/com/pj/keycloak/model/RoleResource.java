package com.pj.keycloak.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Objects;

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
@Table(name = "role_resource")
@Data
public class RoleResource implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_resource_id")
    private int role_resourse_id;

    @ManyToOne
    @JoinColumn(name = "role_id",referencedColumnName = "role_id")
    Role role;

    @ManyToOne
    @JoinColumn(name = "resource_id",referencedColumnName = "resource_id")
    Resource resource;

    @Column(name = "createdAt")
    private Timestamp createdAt;

    @Column(name = "updatedAt")
    private Timestamp updatedAt;

    @Column(name = "edit")
    private Boolean edit;

    @Column(name = "add")
    private Boolean add;

    @Column(name = "view")
    private Boolean view;

    @Column(name = "delete")
    private Boolean delete;

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public int getRole_resourse_id() {
        return role_resourse_id;
    }

    public void setRole_resourse_id(int role_resourse_id) {
        this.role_resourse_id = role_resourse_id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Resource getResource() {
        return resource;
    }

    public void setResource(Resource resource) {
        this.resource = resource;
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

    public Boolean getEdit() {
        return edit;
    }

    public void setEdit(Boolean edit) {
        this.edit = edit;
    }

    public Boolean getAdd() {
        return add;
    }

    public void setAdd(Boolean add) {
        this.add = add;
    }

    public Boolean getView() {
        return view;
    }

    public void setView(Boolean view) {
        this.view = view;
    }

    public Boolean getDelete() {
        return delete;
    }

    public void setDelete(Boolean delete) {
        this.delete = delete;
    }

    
}