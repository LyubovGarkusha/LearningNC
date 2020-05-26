package com.netcracker.backend.service;

import com.netcracker.backend.entity.Login;
import com.netcracker.backend.entity.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LoginService {
    public List<Login> getAllLogins();
    public User getUserByEmail(String email);
    public Login addLogin(Login login);
}
