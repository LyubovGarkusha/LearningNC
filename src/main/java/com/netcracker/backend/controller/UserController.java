package com.netcracker.backend.controller;

import com.netcracker.backend.entity.Student;
import com.netcracker.backend.entity.User;
import com.netcracker.backend.service.StudentService;
import com.netcracker.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ArrayList<User> findAll(){
        return userService.getAllUsers();
    }
}
