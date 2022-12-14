package com.solvd.pojos;

public class Accesory {
    private int id;
    private String name;
    private String type;
    private int stock;

    public Accesory(String name, String type, int stock) {

        this.name = name;
        this.type = type;
        this.stock = stock;
    }

    public Accesory(int id, String name, String type, int stock) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.stock = stock;
    }

    public Accesory() {

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Accesory{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", stock=" + stock +
                '}';
    }
}
