package com.netcracker.backend.service.impl;

import com.netcracker.backend.entity.AnswerTemplate;
import com.netcracker.backend.repository.AnswerTemplateRepository;
import com.netcracker.backend.service.AnswerTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AnswerTemplateServiceImpl implements AnswerTemplateService {

    @Autowired
    private AnswerTemplateRepository answerTemplateRepository;

    @Override
    public List<AnswerTemplate> getAnswersForQuestion(long idQuestion){
        return answerTemplateRepository.findAllByQuestionId(idQuestion);
    }
}
