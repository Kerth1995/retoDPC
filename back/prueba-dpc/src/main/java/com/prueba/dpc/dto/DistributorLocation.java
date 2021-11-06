package com.prueba.dpc.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "distributor_location")
public class DistributorLocation {
    @Id
    private String id;
    private String IdDistributorLocation;
    private String Name;
    private String Address;
    private String Contact;

    public DistributorLocation() {
    }

    public DistributorLocation(String id, String idDistributorLocation, String name, String address, String contact) {
        this.id = id;
        IdDistributorLocation = idDistributorLocation;
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

    public String getIdDistributorLocation() {
        return IdDistributorLocation;
    }

    public void setIdDistributorLocation(String idDistributorLocation) {
        IdDistributorLocation = idDistributorLocation;
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
