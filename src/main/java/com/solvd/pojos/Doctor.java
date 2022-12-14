package com.solvd.pojos;

import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName(value = "Doctor")
public class Doctor {
    private int id;
    private String name;
    private int age;
    private int experience;

    public Doctor(int id, String name, int age, int experience) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.experience = experience;
    }
    public Doctor() {

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

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }
}
