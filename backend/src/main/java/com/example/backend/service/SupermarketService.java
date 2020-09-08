package com.example.backend.service;

import com.example.backend.dto.SupermarketDTO;

import com.example.backend.dto.converter.SupermarketConverter;
import com.example.backend.model.Supermarket;
import com.example.backend.repository.SupermarketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SupermarketService {
    private final SupermarketRepository supermarketRepository;
    private final SupermarketConverter supermarketConverter;



    public Supermarket save(SupermarketDTO supermarketDTO) {
        return supermarketRepository.save(supermarketConverter.convertFromDto(supermarketDTO));
    }

}
