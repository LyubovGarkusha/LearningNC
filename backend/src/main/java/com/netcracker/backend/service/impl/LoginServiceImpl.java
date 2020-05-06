package com.netcracker.backend.service.impl;

import com.netcracker.backend.entity.Login;
import com.netcracker.backend.repository.LoginRepository;
import com.netcracker.backend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepository repository;

    @Override
    public List<Login> getAllLogins(){
        return repository.findAll();
    }
}
