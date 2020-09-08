package com.example.backend.dto;

import lombok.Data;

@Data
public class SupermarketDTO {
    private Long id;

    private String name;

    private Byte[] image;

    private String address;

    private String description;
}
