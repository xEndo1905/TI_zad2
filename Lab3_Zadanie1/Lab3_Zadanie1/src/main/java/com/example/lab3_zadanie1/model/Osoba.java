package com.example.lab3_zadanie1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Osoba {
    @Id
    @GeneratedValue
    private Long id;
    private Integer age;
    private String name;

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public void setAge(Integer age){
        this.age = age;
    }
    public Integer getAge(){
        return age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public Osoba()
    {

    }
    public Osoba(Integer age, String name){
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString(){
        return "Table{" +
                "id = " + id + " " +
                "age = " + age + " " +
                "name = " + name +
                "}";
    }

}
