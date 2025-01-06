package com.example.rest_api;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.example.rest_api.Form ;
import com.example.rest_api.Journal;
@RestController
public class controllers {
    ArrayList<Integer>nums=new ArrayList<>();
    ArrayList<Journal>journals=new ArrayList<>();
    HashMap<Integer,Journal>H=new HashMap<>();
    @GetMapping("/")
    String sayHi(){
        return "hi World";
    }
    @PostMapping("/data")
    boolean postData(@RequestBody int num){
        nums.add(num);
        return true;
    }
    @GetMapping("/data")
    ArrayList<Integer> getData(){
        return nums;
    }

    @PostMapping("/journal")
    void addJournals(@RequestBody Journal j){
        journals.add(j);
        H.put(j.id,j);
    }
    @GetMapping("/journal")
    ArrayList<Journal> allJournals(){
       return journals;
    }
    @GetMapping("/journal-id")
    Journal journalsByID(@RequestBody int id){
        return H.get(id);
    }

    @GetMapping("/journal-id/{id}")
    Journal journalsByID2(@PathVariable int id){
        return H.get(id);
    }
    @PutMapping("/journal")
    boolean updateJournal(@RequestBody Journal j){
        journals.add(j);
        H.put(j.id,j);
        return true;
    }



}
