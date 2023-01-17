package com.example.demo.controller;

import com.example.demo.TakemyhomeApplication;
import com.example.demo.models.House;
import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(TakemyhomeApplication.HOUSEPATH)
public class HouseController {
    private MyService myService = new MyService();
    @Autowired
    private HouseRepository houseRepository;
//    @PostMapping("/addhouse")
//    public @ResponseBody String addHouse(@RequestParam House house) {
//
//    }
}
