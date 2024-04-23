package com.microservice.address.models;

public class AddressResponse {
    private long id;
    private String city;
    private String country;
    private long studentId;
    public AddressResponse() {
    }

    public AddressResponse(AddressDto addressDto) {
        if (addressDto !=null) {
            this.id = addressDto.getId();
            this.city = addressDto.getCity();
            this.country = addressDto.getCountry();
            this.studentId = addressDto.getStudentId();
        }
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }
}
