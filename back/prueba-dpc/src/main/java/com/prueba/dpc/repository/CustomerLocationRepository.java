package com.prueba.dpc.repository;

import com.prueba.dpc.dto.CustomerLocation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerLocationRepository extends MongoRepository<CustomerLocation, String> {
}
