package com.example.rest_api.controller;

import com.example.rest_api.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.rest_api.service.userOperations;
import com.example.rest_api.service.User;
import java.util.List;

@RestController
public class baseController {

    @Autowired
    userOperations u;
    @GetMapping("/")
    ResponseEntity<List<User>> helloWorld(){
        return u.getAllUsers();
    }
    @PostMapping("/")
    ResponseEntity<?> helloWorld(@RequestBody User u1){
         return u.addUser(u1);
    }
}
