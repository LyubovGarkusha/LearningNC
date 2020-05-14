package com.netcracker.fapi.services;

import com.netcracker.fapi.entity.User;

import java.util.List;

public interface UserService {
    User findById(long id);
    List<User> findAll();
    User save(User user);
}
