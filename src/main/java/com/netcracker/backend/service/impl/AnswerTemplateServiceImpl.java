package com.netcracker.backend.service.impl;

import com.netcracker.backend.entity.AnswerSubmitted;
import com.netcracker.backend.entity.AnswerTemplate;
import com.netcracker.backend.entity.Question;
import com.netcracker.backend.repository.AnswerTemplateRepository;
import com.netcracker.backend.repository.QuestionRepository;
import com.netcracker.backend.service.AnswerTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AnswerTemplateServiceImpl implements AnswerTemplateService {

    @Autowired
    private AnswerTemplateRepository answerTemplateRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Override
    public List<AnswerTemplate> getAnswersForQuestion(long idQuestion){
        return answerTemplateRepository.findAllByQuestionId(idQuestion);
    }

    @Override
    public AnswerTemplate add(AnswerTemplate answerTemplate){
        Question question = questionRepository.findById(answerTemplate.getQuestion().getId());
        List<AnswerSubmitted> answerSubmittedList = new ArrayList<AnswerSubmitted>();
        answerTemplate.setQuestion(question);
        answerTemplate.setAnswerSubmittedList(answerSubmittedList);
        return answerTemplateRepository.save(answerTemplate);
    }
}
