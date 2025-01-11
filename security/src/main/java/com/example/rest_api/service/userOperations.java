package com.example.rest_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.example.rest_api.repo.userModel;
import com.example.rest_api.service.User;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Component
public class userOperations {

    @Autowired
    userModel model;


    public ResponseEntity addUser(User userToAdd){
        model.save(userToAdd);
        return new ResponseEntity(null, HttpStatus.OK);
    }

    public ResponseEntity<?> findBySalary(@RequestBody int salary){
//        System.out.println(salary);
        return  new ResponseEntity<>(model.findBySalary(salary),HttpStatus.OK);
    }
    public ResponseEntity<?> findByID(@RequestBody int[] id){
//        System.out.println(id);
//        return null;
        return  new ResponseEntity<>(model.findByID(id),HttpStatus.OK);
    }
    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(model.findAll(),HttpStatus.OK);
    }
}
