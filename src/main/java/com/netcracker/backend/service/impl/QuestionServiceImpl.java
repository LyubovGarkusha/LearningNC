package com.netcracker.backend.service.impl;

import com.netcracker.backend.entity.Question;
import com.netcracker.backend.repository.QuestionRepository;
import com.netcracker.backend.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<Question> getQuestionsForQuiz(long idQuiz){
        return questionRepository.findAllByQuizId(idQuiz);
    }
}
