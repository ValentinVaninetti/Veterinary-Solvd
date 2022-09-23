package com.solvd.pojos;

import java.util.Date;

public class Treatment {
    private Long id;
    private String treatmentName;
    private String petName;
    private Date treatmentDate;
    private int price;
    private String doctorName;
    private Long doctorId;

    public Treatment(String treatmentName, String petName, Date treatmentDate, int price, String doctorName) {
        this.treatmentName = treatmentName;
        this.petName = petName;
        this.treatmentDate = treatmentDate;
        this.price = price;
        this.doctorName = doctorName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public Date getTreatmentDate() {
        return treatmentDate;
    }

    public void setTreatmentDate(Date treatmentDate) {
        this.treatmentDate = treatmentDate;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }
}
