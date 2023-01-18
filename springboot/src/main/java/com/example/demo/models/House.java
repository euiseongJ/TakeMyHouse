package com.example.demo.models;

import jakarta.persistence.Entity;

@Entity
public class House {
    private String address;
    private String city;
    private int phone_number;


    //getters
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;
    }
    public int getPhone_number() {
        return phone_number;
    }
    //setters
    public void setAddress(String address) {
        this.address = address;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
}
