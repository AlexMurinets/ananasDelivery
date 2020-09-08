package com.example.backend.controller;

import com.example.backend.dto.SupermarketDTO;
import com.example.backend.service.SupermarketService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SupermarketController {

    private SupermarketService supermarketService;

    public SupermarketController(SupermarketService supermarketService) {
        this.supermarketService = supermarketService;
    }

    @PostMapping("/supermarket")
    public void addNewMenu(@RequestBody SupermarketDTO supermarketDTO){
       supermarketService.save(supermarketDTO);
    }

}
