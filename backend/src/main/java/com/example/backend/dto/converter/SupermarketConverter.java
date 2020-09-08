package com.example.backend.dto.converter;
import com.example.backend.dto.SupermarketDTO;
import com.example.backend.model.Supermarket;
import org.springframework.stereotype.Service;

@Service
public class SupermarketConverter extends Converter<SupermarketDTO, Supermarket>{
    public SupermarketConverter() {
        super(SupermarketConverter::convertToEntity, SupermarketConverter::convertToDto);
    }

    private static SupermarketDTO convertToDto(Supermarket supermarket) {
        SupermarketDTO supermarketDTO = new SupermarketDTO();

        supermarketDTO.setName(supermarket.getName());
        supermarketDTO.setAddress(supermarket.getAddress());
        supermarketDTO.setDescription(supermarket.getDescription());
        supermarketDTO.setImage(supermarket.getImage());

        return supermarketDTO;
    }

    private static Supermarket convertToEntity(SupermarketDTO supermarketDTO){
        Supermarket supermarket = new Supermarket();

        supermarket.setName(supermarketDTO.getName());
        supermarket.setAddress(supermarketDTO.getAddress());
        supermarket.setDescription(supermarketDTO.getDescription());
        supermarket.setImage(supermarketDTO.getImage());


        return supermarket;
    }
}
