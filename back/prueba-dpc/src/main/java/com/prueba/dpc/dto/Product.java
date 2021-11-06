package com.prueba.dpc.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {

    @Id
    private String id;
    private String IdProduct;
    private String Description;
    private String ProductCode;
    private String DistributorLocationId;
    private String ManufacturerId;

    public Product() {
    }

    public Product(String id, String idProduct, String description, String productCode, String distributorLocationId
            , String manufacturerId) {
        this.id = id;
        IdProduct = idProduct;
        Description = description;
        ProductCode = productCode;
        DistributorLocationId = distributorLocationId;
        ManufacturerId = manufacturerId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdProduct() {
        return IdProduct;
    }

    public void setIdProduct(String idProduct) {
        IdProduct = idProduct;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String productCode) {
        ProductCode = productCode;
    }

    public String getDistributorLocationId() {
        return DistributorLocationId;
    }

    public void setDistributorLocationId(String distributorLocationId) {
        DistributorLocationId = distributorLocationId;
    }

    public String getManufacturerId() {
        return ManufacturerId;
    }

    public void setManufacturerId(String manufacturerId) {
        ManufacturerId = manufacturerId;
    }
}
