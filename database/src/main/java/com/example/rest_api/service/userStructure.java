package com.example.rest_api.service;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class userStructure {
    String username;
    String password;
    @Id
    String id;

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(String id) {
        this.id = id;
    }
    userStructure(String id, String username, String password){
        this.id=id;
        this.username=username;
        this.password=password;
    }
    public userStructure(){}
}
