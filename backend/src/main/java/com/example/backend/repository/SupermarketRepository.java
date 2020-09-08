package com.example.backend.repository;

import com.example.backend.model.Supermarket;
import org.springframework.data.repository.CrudRepository;

public interface SupermarketRepository extends CrudRepository<Supermarket, Long> {
}
