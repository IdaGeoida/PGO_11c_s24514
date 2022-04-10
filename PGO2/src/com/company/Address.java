package com.company;

public class Address {
    private String country;
    private String city;
    private String street;
    private int house;
    private int flat;

    public Address(String country, String city, String street, int house, int flat) {
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.flat = flat;
    }

    public Address address1 = new Address("Poland", "Warszawa","Koszykowa",11,1);

    public Address returnAddress(Address address){
        return address;
    }
}

