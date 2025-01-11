package com.example.rest_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.example.rest_api.repo.userModel;
import com.example.rest_api.service.User;
import java.util.List;


@Component
public class userOperations {

    @Autowired
    userModel model;


    public ResponseEntity addUser(User userToAdd){
        model.save(userToAdd);
        return new ResponseEntity(null, HttpStatus.OK);
    }


    public ResponseEntity<List<User>> getAllUsers(){
        return new ResponseEntity<>(model.findAll(),HttpStatus.OK);
    }
}
