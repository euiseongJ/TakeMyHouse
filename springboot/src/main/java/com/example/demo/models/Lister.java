package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.List;
import java.util.UUID;

@Entity
public class Lister {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID listerId;
    private String name;
    private List<UUID> listedHouseIdArray;
    public UUID getListerId() {
        return listerId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<UUID> getListedHouseIdArray() {
        return listedHouseIdArray;
    }
    public void addToListedHouseIdArray(UUID house) {
        this.listedHouseIdArray.add(house);
    }
    public void setListedHouseIdArray(List<UUID> listedHouseIdArray) {
        this.listedHouseIdArray= listedHouseIdArray;
    }

}
