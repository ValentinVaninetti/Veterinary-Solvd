package com.solvd.pojos;

public class Medicine {
    private int id;
    private String name;
    private int Stock;
    private int price;

    public Medicine(int id, String name, int stock, int price) {
        this.id = id;
        this.name = name;
        Stock = stock;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
