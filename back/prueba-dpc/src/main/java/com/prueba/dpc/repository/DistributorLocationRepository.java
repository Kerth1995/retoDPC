package com.prueba.dpc.repository;

import com.prueba.dpc.dto.DistributorLocation;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DistributorLocationRepository extends MongoRepository<DistributorLocation, String> {
}
