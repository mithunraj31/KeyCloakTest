package com.pj.keycloak.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "resource")
@Data
public class Resource implements Serializable{
    /**
     *
     */
    private static final long serialVersionUID = -1922700495609379588L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "resource_id")
    private int resourse_id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private Boolean description;

    @OneToMany(mappedBy = "resource")
    Set<RoleResource> previlleges;
    
    public int getResourse_id() {
        return resourse_id;
    }

    public void setResourse_id(int resourse_id) {
        this.resourse_id = resourse_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDescription() {
        return description;
    }

    public void setDescription(Boolean description) {
        this.description = description;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }


}