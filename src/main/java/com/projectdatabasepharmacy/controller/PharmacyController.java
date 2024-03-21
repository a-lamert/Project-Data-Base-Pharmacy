package com.projectdatabasepharmacy.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("/pharmacyController")
@RequestMapping
public class PharmacyController {
    @PostMapping("/add")
    public String addPharmacy(@RequestBody PharmacyController pharmacy) {

        return null;
    }

    @GetMapping
    public List<PharmacyController> getAllPharmacyControllers() {

        return null;
    }

}


