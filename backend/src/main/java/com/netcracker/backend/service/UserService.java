package com.netcracker.backend.service;

import com.netcracker.backend.entity.User;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public interface UserService {
   public ArrayList<User> getAllUsers();
   public User getUserById(long id);
   public User addUser(User user);
}
