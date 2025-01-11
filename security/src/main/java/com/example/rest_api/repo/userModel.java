package com.example.rest_api.repo;

import com.example.rest_api.service.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface userModel extends MongoRepository<User,String> {
    @Query("{'SALARY':{$gte:?0}}")
    List<User> findBySalary(int salary);

    @Query("{'WORKER_ID':{$in:?0}}")
    List<User> findByID(int[] id);
}
