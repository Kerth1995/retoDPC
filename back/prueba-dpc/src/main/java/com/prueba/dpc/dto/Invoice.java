package com.prueba.dpc.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "invoice")
public class Invoice {

    @Id
    private String id;
    private String IdInvoice;
    private String InvoiceNumber;
    private String PurchaseDate;
    private String TotalPurchases;
    private String CustomerLocationId;
    private String DistributorLocationId;

    public Invoice() {
    }

    public Invoice(String id, String idInvoice, String invoiceNumber, String purchaseDate, String totalPurchases
            , String customerLocationId, String distributorLocationId) {
        this.id = id;
        IdInvoice = idInvoice;
        InvoiceNumber = invoiceNumber;
        PurchaseDate = purchaseDate;
        TotalPurchases = totalPurchases;
        CustomerLocationId = customerLocationId;
        DistributorLocationId = distributorLocationId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdInvoice() {
        return IdInvoice;
    }

    public void setIdInvoice(String idInvoice) {
        IdInvoice = idInvoice;
    }

    public String getInvoiceNumber() {
        return InvoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        InvoiceNumber = invoiceNumber;
    }

    public String getPurchaseDate() {
        return PurchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        PurchaseDate = purchaseDate;
    }

    public String getTotalPurchases() {
        return TotalPurchases;
    }

    public void setTotalPurchases(String totalPurchases) {
        TotalPurchases = totalPurchases;
    }

    public String getCustomerLocationId() {
        return CustomerLocationId;
    }

    public void setCustomerLocationId(String customerLocationId) {
        CustomerLocationId = customerLocationId;
    }

    public String getDistributorLocationId() {
        return DistributorLocationId;
    }

    public void setDistributorLocationId(String distributorLocationId) {
        DistributorLocationId = distributorLocationId;
    }
}
