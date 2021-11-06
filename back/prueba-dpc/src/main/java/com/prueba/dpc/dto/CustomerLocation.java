package com.prueba.dpc.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer_location")
public class CustomerLocation {
    @Id
    private String id;
    private String IdCustomerLocation;
    private String Name;
    private String Address;
    private String Contact;

    public CustomerLocation() {
    }

    public CustomerLocation(String id, String idCustomerLocation, String name, String address, String contact) {
        this.id = id;
        IdCustomerLocation = idCustomerLocation;
        Name = name;
        Address = address;
        Contact = contact;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCustomerLocation() {
        return IdCustomerLocation;
    }

    public void setIdCustomerLocation(String idCustomerLocation) {
        IdCustomerLocation = idCustomerLocation;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        Contact = contact;
    }
}
