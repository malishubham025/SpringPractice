package com.example.rest_api.service;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.annotation.Collation;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.repository.MongoRepository;


import java.util.ArrayList;
import java.util.Date;

@Document(collection = "orgs")
public class User {
    int WORKER_ID;
    String FIRST_NAME;
    String LAST_NAME;
    int SALARY;
    Date JOINING_DATE;
    String DEPARTMENT;
    public User(){

    }
    public User(int WORKER_ID, String FIRST_NAME, String LAST_NAME, int SALARY, Date JOINING_DATE, String DEPARTMENT) {
        this.WORKER_ID = WORKER_ID;
        this.FIRST_NAME = FIRST_NAME;
        this.LAST_NAME = LAST_NAME;
        this.SALARY = SALARY;
        this.JOINING_DATE = JOINING_DATE;
        this.DEPARTMENT = DEPARTMENT;
    }

    public int getWORKER_ID() {
        return WORKER_ID;
    }

    public void setWORKER_ID(int WORKER_ID) {
        this.WORKER_ID = WORKER_ID;
    }

    public String getFIRST_NAME() {
        return FIRST_NAME;
    }

    public void setFIRST_NAME(String FIRST_NAME) {
        this.FIRST_NAME = FIRST_NAME;
    }

    public String getLAST_NAME() {
        return LAST_NAME;
    }

    public void setLAST_NAME(String LAST_NAME) {
        this.LAST_NAME = LAST_NAME;
    }

    public int getSALARY() {
        return SALARY;
    }

    public void setSALARY(int SALARY) {
        this.SALARY = SALARY;
    }

    public Date getJOINING_DATE() {
        return JOINING_DATE;
    }

    public void setJOINING_DATE(Date JOINING_DATE) {
        this.JOINING_DATE = JOINING_DATE;
    }

    public String getDEPARTMENT() {
        return DEPARTMENT;
    }

    public void setDEPARTMENT(String DEPARTMENT) {
        this.DEPARTMENT = DEPARTMENT;
    }
}
