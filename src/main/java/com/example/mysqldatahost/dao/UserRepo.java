package com.example.mysqldatahost.dao;

import com.example.mysqldatahost.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer> {
}
