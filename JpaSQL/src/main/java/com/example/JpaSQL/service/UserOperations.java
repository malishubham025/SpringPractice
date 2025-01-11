package com.example.JpaSQL.service;

import com.example.JpaSQL.repository.User;
import com.example.JpaSQL.repository.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
@Component
public class UserOperations {

    @Autowired
    UserModel model;
    public ResponseEntity<?> addUser(  User u){
        try{
            model.save(u);
            return new ResponseEntity<>("User added", HttpStatusCode.valueOf(200));
        }
        catch (Exception e) {
            return new ResponseEntity<>("unable to add user " + e, HttpStatusCode.valueOf(500));
        }
    }

    public ResponseEntity<?> getAllUsers(){
        try{
//            model.save(u);
            return new ResponseEntity<>(new ArrayList<User>(model.findAll()), HttpStatusCode.valueOf(200));
        }
        catch (Exception e) {
            return new ResponseEntity<>("unable to get all users " + e, HttpStatusCode.valueOf(500));
        }
    }

    public ResponseEntity<?> getUser(  int id){
        try{
//            List<User>L=
            return new ResponseEntity<>(model.findById(id), HttpStatusCode.valueOf(200));
        }
        catch (Exception e) {
            return new ResponseEntity<>("unable to find user " + e, HttpStatusCode.valueOf(500));
        }
//        model.findOne(id);
    }

}
