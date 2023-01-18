package com.example.demo.controller;

import com.example.demo.models.House;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HouseRepository extends JpaRepository<House, Long>{

}
