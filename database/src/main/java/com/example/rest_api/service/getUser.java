package com.example.rest_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import com.example.rest_api.service.userStructure;
import com.example.rest_api.repo.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class getUser {

    @Autowired model m;
    public void addUser(userStructure user){
        m.save(user);
    }
    public void updateUser(userStructure user){
        if(user.getId()!=null && m.findById(user.getId())!=null){
//            System.out.println();
            m.save(user);
        }
        System.out.println(user.getId()+" "+user.getPassword());
    }

    public ResponseEntity<?> deleteUser(userStructure user){
        System.out.println(user.getId());
        Optional<userStructure>o=m.findById(user.getId());
        if(o.isPresent()){
            System.out.println("hi");
            m.delete(user);

//            ResponseEntity<List<userStructure>> r=new ResponseEntity<>(m.findAll(),HttpStatus.BAD_REQUEST);
            return new ResponseEntity<>(m.findAll(), HttpStatus.OK);
        }
        else {
            System.out.println("h22");

            return new ResponseEntity<>("no user exist",HttpStatus.BAD_REQUEST);
        }
    }

    public ArrayList<userStructure> getUsers(){
        return new ArrayList<>(m.findAll());
    }

}
