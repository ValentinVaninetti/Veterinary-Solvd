package com.solvd.pojos;

public class Veterinary {
    private Long id;
    private String vetName;
    private String city;
    private String address;

    public Veterinary(String vetName, String city, String address) {
        this.vetName = vetName;
        this.city = city;
        this.address = address;
    }

    public Long getId() {
        return id;
    }


    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
