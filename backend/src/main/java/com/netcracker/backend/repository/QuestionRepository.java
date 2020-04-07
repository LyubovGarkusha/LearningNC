package com.netcracker.backend.repository;

import com.netcracker.backend.entity.Question;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends CrudRepository<Question,Long> {
    public List<Question> findAllByQuizId(long quizId);
    public Question findById(long questionId);
}
