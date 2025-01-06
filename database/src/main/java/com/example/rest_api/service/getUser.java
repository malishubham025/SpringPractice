package com.example.rest_api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.example.rest_api.service.userStructure;
import com.example.rest_api.repo.model;

import java.util.ArrayList;
import java.util.List;

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

    public ArrayList<userStructure> deleteUser(userStructure user){
        m.delete(user);
        return new ArrayList<>(m.findAll());
    }

    public ArrayList<userStructure> getUsers(){
        return new ArrayList<>(m.findAll());
    }

}
