package com.example.rest_api.repo;

import com.example.rest_api.service.userStructure;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface model extends MongoRepository<userStructure,String> {
}
