package com.netcracker.backend.repository;

import com.netcracker.backend.entity.Quiz;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends CrudRepository<Quiz, Long> {
    public List<Quiz> findAll();
    public void deleteQuizById(long id);
    public Quiz save(Quiz quiz);
    public Quiz findQuizById(long id);

}
