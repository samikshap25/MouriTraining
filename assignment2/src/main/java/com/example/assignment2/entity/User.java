package com.example.assignment2.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fname;
    private String lname;
    private int age;
    private String city;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
   
    public User() {
    }
    
    public User(Long id, String fname, String lname, int age, String city, LocalDateTime createdAt,
            LocalDateTime updatedAt) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.city = city;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    @PrePersist
protected void onCreate() {
    this.createdAt = LocalDateTime.now();
    this.updatedAt = LocalDateTime.now();
}

@PreUpdate
protected void onUpdate() {
    this.updatedAt = LocalDateTime.now();
}

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getFname() {
    return fname;
}

public void setFname(String fname) {
    this.fname = fname;
}

public String getLname() {
    return lname;
}

public void setLname(String lname) {
    this.lname = lname;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public String getCity() {
    return city;
}

public void setCity(String city) {
    this.city = city;
}

public LocalDateTime getCreatedAt() {
    return createdAt;
}

public void setCreatedAt(LocalDateTime createdAt) {
    this.createdAt = createdAt;
}

public LocalDateTime getUpdatedAt() {
    return updatedAt;
}

public void setUpdatedAt(LocalDateTime updatedAt) {
    this.updatedAt = updatedAt;
}

}

