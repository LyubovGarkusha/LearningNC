package com.netcracker.backend.service;

import com.netcracker.backend.entity.Question;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface QuestionService {
    public List<Question> getQuestionsForQuiz(long idQuiz);
    public Question findById (long questionId);
}
