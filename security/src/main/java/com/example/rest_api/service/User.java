package com.example.rest_api.service;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

import java.util.ArrayList;

@Document(collection = "userStructure")
public class User {
    String username;
    String password;

    @Id
    String id;
    public String getUsername(){
        return this.username;
    }
    public String getPassword(){
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getId() {

        

        return id;
    }
}
