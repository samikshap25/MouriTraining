package com.example.assignment2.dto;

public class UserDTO {
    private String fname;
    private String lname;
    private int age;
    private String city;

    public UserDTO() {
    }

    public UserDTO(String fname, String lname, int age, String city) {
        this.fname = fname;
        this.lname = lname;
        this.age = age;
        this.city = city;
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

    
    
}

