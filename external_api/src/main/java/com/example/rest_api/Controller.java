package com.example.rest_api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.rest_api.User;
@RestController
public class Controller {
    @GetMapping("/")
    String hello(){
        return "hello";
    }

    @Autowired
    private RestTemplate template;

    @PostMapping("/")
    ResponseEntity<?> getinfo(@RequestBody String  name){
        String api="https://api.agify.io/?name= "+name;
        ResponseEntity<User> res=template.exchange(api, HttpMethod.GET,null,User.class);
        return  new ResponseEntity<>(res.getBody(),HttpStatus.valueOf(200));
    }

}
