package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class dog {
    String name;
    int age;
    String print(){
        String s="name of the dog is "+this.name+" and age is "+this.age;
        return  s;
    }
    dog(String name,int age){
        this.age=age;
        this.name=name;
    }
    dog(){
        System.out.println("hi");
    }
}
