package com.netcracker.backend.service.impl;

import com.netcracker.backend.entity.AnswerSubmitted;
import com.netcracker.backend.repository.AnswerSubmittedRepository;
import com.netcracker.backend.service.AnswerSubmittedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Component
@Transactional
public class AnswerSubmittedServiceImpl implements AnswerSubmittedService {

    @Autowired
    private AnswerSubmittedRepository answerSubmittedRepository;

    @Override
    public List<AnswerSubmitted> getAnswersByQuiz(long quizId){
        return answerSubmittedRepository.findAllByQuizId(quizId);
    }
}
