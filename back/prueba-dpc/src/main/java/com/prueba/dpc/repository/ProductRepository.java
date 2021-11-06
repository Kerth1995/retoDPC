package com.prueba.dpc.repository;

import com.prueba.dpc.dto.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
