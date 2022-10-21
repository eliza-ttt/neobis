package com.example.demo.doctor;

import java.time.LocalDate;

public class Doctor {
    private Long id;
    private String name;
    private String position;
    private LocalDate dofb;
    private Integer age;

    public Doctor(){

    }
    public Doctor(Long id,
                  String name,
                  String position,
                  LocalDate dofb,
                  Integer age){
        this.id = id;
        this.name = name;
        this.position = position;
        this.dofb = dofb;
        this.age = age;


    }

    public Doctor(String name,
                  String position,
                  LocalDate dofb,
                  Integer age) {
        this.name = name;
        this.position = position;
        this.dofb = dofb;
        this.age = age;
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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public LocalDate getDofb() {
        return dofb;
    }

    public void setDofb(LocalDate dofb) {
        this.dofb = dofb;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", position='" + position + '\'' +
                ", dofb=" + dofb +
                ", age=" + age +
                '}';
    }
}
