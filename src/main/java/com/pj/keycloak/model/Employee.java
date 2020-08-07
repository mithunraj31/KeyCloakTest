package com.pj.keycloak.model;


import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


@Entity
@Table(name = "employee")
@Data
public class Employee extends UserProfile implements Serializable
{
    private static final long serialVersionUID = -2482579485413606056L;

    @Column(name = "employee_id")
    private Long employeeId;

    @Column(name = "location")
    private String location;

    @Column(name = "salary")
    private Double salary;

    @ManyToMany
    @JoinTable(name = "employee_project",
            joinColumns = @JoinColumn(name = "employee_id",referencedColumnName = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id", referencedColumnName = "id"))
    private Set<Project> projects=new HashSet<>();


    @Override
    public boolean equals(Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        if (!super.equals(o))
            return false;
        Employee employee = (Employee) o;
        return getEmployeeId().equals(employee.getEmployeeId());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), getEmployeeId());
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Set<Project> getProjects() {
        return projects;
    }

    public void setProjects(Set<Project> projects) {
        this.projects = projects;
    }
}
