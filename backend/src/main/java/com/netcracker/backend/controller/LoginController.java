package com.netcracker.backend.controller;

import com.netcracker.backend.entity.Login;
import com.netcracker.backend.entity.User;
import com.netcracker.backend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logins")
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping( value = "/all", method = RequestMethod.GET)
    public List<Login> getAll(){
        return loginService.getAllLogins();
    }

    @RequestMapping( value = "/{email}", method = RequestMethod.GET)
    public User getUserByEmail(@PathVariable(name = "email") String email){
        return loginService.getUserByEmail(email);
    }

}
