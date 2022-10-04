package com.solvd.pojos;
import jakarta.xml.bind.annotation.*;


@XmlRootElement(name = "client")
@XmlType(propOrder = {"id", "name", "age","petName"})
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
    public Client(){

    }
    @XmlAttribute
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @XmlElement
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @XmlElement
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", petName='" + petName + '\'' +
                '}';
    }
}
