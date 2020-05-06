package com.netcracker.backend.service.impl;

import com.netcracker.backend.entity.Quiz;
import com.netcracker.backend.repository.QuizRepository;
import com.netcracker.backend.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class QuizServiceImpl implements QuizService {

    @Autowired
    public QuizRepository quizRepository;

    @Override
    public List<Quiz> getAllQuiz(){
        return quizRepository.findAll();
    }

    @Override
    public void deleteQuiz(long id){
        quizRepository.deleteQuizById(id);
    }
    @Override
    public Quiz add(Quiz quiz){
        return quizRepository.save(quiz);
    }
    @Override
    public Quiz getQuizById(long id) {
        return quizRepository.findQuizById(id);
    }
}
