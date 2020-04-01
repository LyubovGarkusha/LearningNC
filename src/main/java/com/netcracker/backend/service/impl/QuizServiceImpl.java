package com.netcracker.backend.service.impl;

import com.netcracker.backend.entity.Quiz;
import com.netcracker.backend.repository.QuizRepository;
import com.netcracker.backend.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuizServiceImpl implements QuizService {

    @Autowired
    public QuizRepository quizRepository;

    @Override
    public List<Quiz> getAllQuiz(){
        return quizRepository.findAll();
    }

}
