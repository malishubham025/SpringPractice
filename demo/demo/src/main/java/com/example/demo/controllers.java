package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllers {
    @Autowired
    public dog d;
//    public dog d1;

    @GetMapping(path="/ji")
    public String hello(){
//        d1.name="shubham";
//        d1.age=100;
        d.name="shubham";
        d.age=10;
        return "hi bochya"+d.print();
    }
    @GetMapping(path="/hi")
    public String hello2(){
        return "hi bochesh";
    }
}
