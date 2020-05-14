package com.netcracker.fapi.services;

import com.netcracker.fapi.entity.Quiz;

import java.util.List;

public interface QuizService {
    public List<Quiz> getAllQuiz();
    public void deleteQuiz(long id);
    public Quiz add(Quiz quiz);
    public Quiz getQuizById(long id);
}
