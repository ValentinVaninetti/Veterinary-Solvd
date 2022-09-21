package com.solvd.pojos;

public class Accesorie {
    private Long id;
    private String name;
    private String type;
    private int stock;

    public Accesorie(Long id, String name, String type, int stock) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.stock = stock;
    }

    public Accesorie() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
}
