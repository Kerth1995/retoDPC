package com.prueba.dpc.repository;

import com.prueba.dpc.dto.Invoice;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InvoiceRepository extends MongoRepository<Invoice, String> {
}
