package com.example.a25hdesign.CkeckOut.model;

import java.io.Serializable;

public class ShippingAddressModel implements Serializable {
    private String name;
    private String address;
    private String nationCode;

    public ShippingAddressModel(String name, String address, String nationCode) {
        this.name = name;
        this.address = address;
        this.nationCode = nationCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationCode() {
        return nationCode;
    }

    public void setNationCode(String nationCode) {
        this.nationCode = nationCode;
    }
}
