package com.solvd.pojos;

public class Pet {
    private int id;
    private String specie;
    private String name;
    private int age;
    private String ownerName;
    private int ownerId;

    public Pet(int id, String specie, String name, int age, String ownerName, int ownerId) {
        this.id = id;
        this.specie = specie;
        this.name = name;
        this.age = age;
        this.ownerName = ownerName;
        this.ownerId = ownerId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }
}
