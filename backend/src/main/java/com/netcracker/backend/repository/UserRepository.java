package com.netcracker.backend.repository;

import com.netcracker.backend.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    ArrayList<User> findAll();
    User findById(long id);
    User save(User user);
}
