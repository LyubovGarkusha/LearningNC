package com.netcracker.backend.service.impl;

import com.netcracker.backend.entity.Login;
import com.netcracker.backend.entity.User;
import com.netcracker.backend.repository.LoginRepository;
import com.netcracker.backend.repository.UserRepository;
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
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Login> getAllLogins(){
        return repository.findAll();
    }

    @Override
    public User getUserByEmail(String email){
        return userRepository.findById(repository.findByEmail(email).getUser().getId());
    }

    @Override
    public Login addLogin(Login login){

        return repository.save(login);
    }

}
