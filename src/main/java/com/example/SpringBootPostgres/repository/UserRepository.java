package com.example.SpringBootPostgres.repository;

import com.example.SpringBootPostgres.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
