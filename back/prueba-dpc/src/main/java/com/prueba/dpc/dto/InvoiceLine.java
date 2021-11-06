package com.prueba.dpc.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "invoice_line")
public class InvoiceLine {

    @Id
    private String id;
    private String IdInvoiceLine;
    private String Qty;
    private String Weight;
    private String UnitOfMeasure;
    private String ProductId;
    private String InvoiceId;

    public InvoiceLine() {
    }

    public InvoiceLine(String id, String idInvoiceLine, String qty, String weight, String unitOfMeasure
            , String productId, String invoiceId) {
        this.id = id;
        IdInvoiceLine = idInvoiceLine;
        Qty = qty;
        Weight = weight;
        UnitOfMeasure = unitOfMeasure;
        ProductId = productId;
        InvoiceId = invoiceId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdInvoiceLine() {
        return IdInvoiceLine;
    }

    public void setIdInvoiceLine(String idInvoiceLine) {
        IdInvoiceLine = idInvoiceLine;
    }

    public String getQty() {
        return Qty;
    }

    public void setQty(String qty) {
        Qty = qty;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public String getUnitOfMeasure() {
        return UnitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        UnitOfMeasure = unitOfMeasure;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getInvoiceId() {
        return InvoiceId;
    }

    public void setInvoiceId(String invoiceId) {
        InvoiceId = invoiceId;
    }
}
