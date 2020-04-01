package com.netcracker.backend.service.impl;

import com.netcracker.backend.entity.Student;
import com.netcracker.backend.entity.User;
import com.netcracker.backend.repository.StudentRepository;
import com.netcracker.backend.repository.UserRepository;
import com.netcracker.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;


    @Override
    public ArrayList<User> getAllUsers() {
        return userRepository.findAll();
    }
}
