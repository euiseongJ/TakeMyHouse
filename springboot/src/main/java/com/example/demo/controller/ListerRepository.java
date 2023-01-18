package com.example.demo.controller;

import com.example.demo.models.Lister;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

public interface ListerRepository extends JpaRepository<Lister, UUID>{

}
