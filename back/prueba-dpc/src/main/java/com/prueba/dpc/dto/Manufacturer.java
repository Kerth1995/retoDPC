package com.prueba.dpc.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "manufacturer")
public class Manufacturer {

    @Id
    private String id;
    private String IdCustomer;
    private String Name;
    private String Address;
    private String Contact;

    public Manufacturer() {
    }

    public Manufacturer(String id, String idCustomer, String name, String address, String contact) {
        this.id = id;
        IdCustomer = idCustomer;
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

    public String getIdCustomer() {
        return IdCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        IdCustomer = idCustomer;
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
