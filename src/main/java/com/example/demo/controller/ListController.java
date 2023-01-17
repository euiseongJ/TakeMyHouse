package com.example.demo.controller;

import com.example.demo.TakemyhomeApplication;
import com.example.demo.models.Lister;
import com.example.demo.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping(TakemyhomeApplication.LISTERPATH)
public class ListController {
    private MyService myService = new MyService();
    @Autowired
    private ListerRepository listerRepository;
    @GetMapping("/getbylisterid")
    public @ResponseBody Optional<Lister> getByListerId(@RequestParam UUID id) {
        return listerRepository.findById(id);
    }
    @PostMapping("/addlister")
    public @ResponseBody String addLister(@RequestParam String name) {
        Lister lister = new Lister();
        lister.setName(name);
        listerRepository.save(lister);
        return "Saved with UUID: " + lister.getListerId();
    }


}
