package com.example.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.security.model.UserT;

public interface UserRepository extends JpaRepository<UserT, Long> {
    UserT findByUsername(String username);
}
