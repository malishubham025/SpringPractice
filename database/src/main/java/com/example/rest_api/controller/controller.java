package com.example.rest_api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.rest_api.service.userStructure;
import com.example.rest_api.repo.model;

import java.util.ArrayList;
import com.example.rest_api.service.getUser;
@RestController
public class controller {

    @Autowired getUser user;
    @GetMapping("/")
    String getWorld(){
        return  "hello world !";
    }
    @PostMapping("/addUser")
    void  saveUser(@RequestBody userStructure newUser){
        user.addUser(newUser);
    }

    @PostMapping("/getAllUsers")
    ArrayList<userStructure> getEntries(){
        return user.getUsers();
    }
    @PostMapping("/updateUser")
    void updateUser(@RequestBody userStructure newUser){
        user.updateUser(newUser);
    }
    @PostMapping("/deleteUser")
    ArrayList<userStructure> deleteUser(@RequestBody userStructure deleteUser){
        return new ArrayList<>(user.deleteUser(deleteUser));
    }
}
