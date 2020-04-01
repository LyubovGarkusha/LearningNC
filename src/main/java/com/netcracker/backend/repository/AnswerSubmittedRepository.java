package com.netcracker.backend.repository;

import com.netcracker.backend.entity.AnswerSubmitted;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnswerSubmittedRepository extends CrudRepository<AnswerSubmitted, Long> {
    public List<AnswerSubmitted> findAllByQuizId(long quizId);
}
