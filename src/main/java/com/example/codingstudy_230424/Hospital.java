package com.example.codingstudy_230424;

import com.example.codingstudy_230424.w4.Address;

public class Hospital {
    private String name;
    private String phoneNumber;
    private Address address;
    private String websiteAddr;

    public Hospital(String name, String phoneNumber, Address address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public String getWebsiteAddr() {
        return websiteAddr;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Address getAddress() {
        return address;
    }
}