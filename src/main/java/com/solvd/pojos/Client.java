package com.solvd.pojos;

public class Client {
    private int id;
    private String name;
    private int age;
    private String petName;

    public Client(int id, String name, int age, String petName) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.petName = petName;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }
}
