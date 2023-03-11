package com.example.mysqldatahost.controller;

import com.example.mysqldatahost.dao.UserRepo;
import com.example.mysqldatahost.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class UserController {
    @Autowired
    UserRepo userRepo;
    @PostMapping("add-user")
    public ResponseEntity<String> saveUser(@RequestBody Users users){
        Users user = userRepo.save(users);
        return new ResponseEntity<>("user saved with id "+user.getUserId(), HttpStatus.CREATED);
    }
    @GetMapping("get-all")
    public List<Users> getAll(){
        return userRepo.findAll();
    }

}
