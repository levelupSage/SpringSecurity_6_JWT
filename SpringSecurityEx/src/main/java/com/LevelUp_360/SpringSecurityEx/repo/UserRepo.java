package com.LevelUp_360.SpringSecurityEx.repo;

import com.LevelUp_360.SpringSecurityEx.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {
    Users findByUsername(String username);

    //plan -> hash1 -> hash2
}
