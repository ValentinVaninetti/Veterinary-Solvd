package com.solvd.pojos;

import java.util.Date;

public class Payment {
    private int id;
    private String paymentMethod;
    private int price;
    private String info;
    private Date paymentDate;
    private int idClient;

    public Payment(int id, String paymentMethod, int price, String info, Date paymentDate, int idClient) {
        this.id = id;
        this.paymentMethod = paymentMethod;
        this.price = price;
        this.info = info;
        this.paymentDate = paymentDate;
        this.idClient = idClient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }
}
