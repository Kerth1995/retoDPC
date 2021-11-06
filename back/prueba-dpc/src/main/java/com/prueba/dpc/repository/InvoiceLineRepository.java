package com.prueba.dpc.repository;

import com.prueba.dpc.dto.InvoiceLine;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoiceLineRepository extends MongoRepository<InvoiceLine, String> {
}
