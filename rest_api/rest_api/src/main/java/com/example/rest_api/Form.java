package com.example.rest_api;

public class Form {
    String name;
    String surname;
    Form(String name, String surname){
        this.name=name;
        this.surname=surname;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
