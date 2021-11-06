package com.prueba.dpc.controller;

import com.prueba.dpc.dto.*;
import com.prueba.dpc.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
public class controller {

    @Autowired
    CustomerLocationRepository customerLocationRepository;

    @Autowired
    DistributorLocationRepository distributorLocationRepository;

    @Autowired
    InvoiceRepository invoiceRepository;

    @Autowired
    InvoiceLineRepository invoiceLineRepository;

    @Autowired
    ManufacturerRepository manufacturerRepository;

    @Autowired
    ProductRepository productRepository;

    @GetMapping("/customer")
    public List<CustomerLocation> getCustomerLocation(){
        List<CustomerLocation> customerLocation;
        customerLocation = customerLocationRepository.findAll();
        return customerLocation;
    }

    @GetMapping("/distributor")
    public List<DistributorLocation> getDistributorLocation(){
        List<DistributorLocation> distributorLocations;
        distributorLocations = distributorLocationRepository.findAll();
        return distributorLocations;
    }

    @GetMapping("/invoice")
    public List<Invoice> getInvoice(){
        List<Invoice> invoices;
        List<CustomerLocation> customerLocation = getCustomerLocation();
        List<DistributorLocation> distributorLocation = getDistributorLocation();
        invoices = invoiceRepository.findAll();
        List<Invoice> invoicesTwo = new ArrayList<>();
        for (Invoice data:invoices) {
            for (CustomerLocation param1:customerLocation) {
                if(param1.getIdCustomerLocation().equals(data.getCustomerLocationId()) ){
                    data.setCustomerLocationId(param1.getName());
                }
            }

            for (DistributorLocation param2:distributorLocation) {
                if(param2.getIdDistributorLocation().equals(data.getDistributorLocationId())){
                    data.setDistributorLocationId(param2.getName());
                }
            }
            invoicesTwo.add(data);
        }
        return invoicesTwo;
    }

    @GetMapping("/invoiceLine")
    public List<InvoiceLine> getInvoiceLine(){
        List<InvoiceLine> invoiceLines;
        invoiceLines = invoiceLineRepository.findAll();
        return invoiceLines;
    }

    @GetMapping("/manufacturer")
    public List<Manufacturer> getManufacturer(){
        List<Manufacturer> manufacturers;
        manufacturers = manufacturerRepository.findAll();
        return manufacturers;
    }

    @GetMapping("/products")
    public List<Product> getProduct(){
        List<Product> products;
        List<DistributorLocation> distributorLocations = getDistributorLocation();
        List<Manufacturer>  manufacturers = getManufacturer();
        products = productRepository.findAll();

        List<Product> productsTwo = new ArrayList<>();
        for (Product data:products) {
            for (DistributorLocation param1:distributorLocations) {
                if(param1.getIdDistributorLocation().equals(data.getDistributorLocationId()) ){
                    data.setDistributorLocationId(param1.getName());
                }
            }

            for (Manufacturer param2:manufacturers) {
                if(param2.getIdCustomer().equals(data.getManufacturerId())){
                    data.setManufacturerId(param2.getName());
                }
            }
            productsTwo.add(data);
        }
        return products;
    }
}
