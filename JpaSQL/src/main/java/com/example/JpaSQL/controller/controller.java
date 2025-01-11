package com.example.JpaSQL.controller;

import com.example.JpaSQL.repository.User;
import com.example.JpaSQL.service.UserOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class controller {
    @Autowired
    UserOperations UserOpe;
    @GetMapping("/")
    String hello(){
       return "hello";
    }
    @PostMapping("/")
    ResponseEntity<?> allUsers(){
        return UserOpe.getAllUsers();
    }
    @PutMapping("/")
    ResponseEntity<?> addUser(@RequestBody  User u){
        return UserOpe.addUser(u);
    }
    @PostMapping("/{id}")
    ResponseEntity<?> userbyID(@PathVariable int id){
        return UserOpe.getUser(id);
    }


}
