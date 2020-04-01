package com.netcracker.backend.repository;

import com.netcracker.backend.entity.Quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends CrudRepository<Quiz, Long> {
    public List<Quiz> findAll();
}
