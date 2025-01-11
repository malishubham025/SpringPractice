package com.example.JpaSQL.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserModel  extends JpaRepository<User,Integer> {
}
