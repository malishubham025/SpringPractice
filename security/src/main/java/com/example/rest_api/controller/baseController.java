package com.example.rest_api.controller;

import com.example.rest_api.service.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.rest_api.service.userOperations;

import java.util.HashMap;
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

    @PostMapping("/{salary}")
    ResponseEntity<?> findSalary(@PathVariable int salary){
        System.out.println(salary);
        return u.findBySalary(salary);
    }
    @PostMapping("/workerid")
    ResponseEntity<?> findWorkerID(@RequestBody HashMap<String,int[]>m){
//        System.out.println(m.get("id")[0]);
//        return "null";
        return u.findByID(m.get("id"));
    }
}
