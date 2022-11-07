package com.example.lynxpratica.controller;

import com.example.lynxpratica.data.User;
import com.example.lynxpratica.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    UserRepository userRepository;

    @GetMapping("user/{id}")
    public User findUserById(@RequestParam Integer id){
        return userRepository.findById(id).orElse(null);
    }
}
