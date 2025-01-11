package com.example.rest_api.repo;

import com.example.rest_api.service.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface userModel extends MongoRepository<User,String> {
}
