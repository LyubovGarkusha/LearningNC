package com.netcracker.backend.service;

import com.netcracker.backend.entity.Login;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface LoginService {
    public List<Login> getAllLogins();
}
