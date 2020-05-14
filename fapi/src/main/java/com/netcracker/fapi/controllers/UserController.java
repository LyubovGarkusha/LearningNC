package com.netcracker.fapi.controllers;

import com.netcracker.fapi.entity.User;
import com.netcracker.fapi.services.LoginService;
import com.netcracker.fapi.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private LoginService loginService;

    @PreAuthorize("hasRole('admin')")
    @GetMapping("/all")
    public List<User> getAllUsers(){
        return userService.findAll();
    }

    @GetMapping("/login/{email}")
    public User getUserByEmail(@PathVariable String email ) {
        return loginService.findByEmail(email);
    }

    @PreAuthorize("isAuthenticated()")
    @GetMapping("/current")
    public User getCurrentUser() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        // todo exclude password from model!
        return loginService.findByEmail(((org.springframework.security.core.userdetails.User) authentication.getPrincipal()).getUsername());
    }

    @PreAuthorize("isAnonymous()")
    @RequestMapping(value="/signup", method = RequestMethod.POST, produces = "application/json")
    public User saveUser(@RequestBody User user){
        return userService.save(user);
    }
}