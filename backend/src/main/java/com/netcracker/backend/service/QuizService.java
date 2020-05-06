package com.netcracker.backend.service;

import com.netcracker.backend.entity.Quiz;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface QuizService {
    public List<Quiz> getAllQuiz();
    public void deleteQuiz(long id);
    public Quiz add(Quiz quiz);
    public Quiz getQuizById(long id);
}
