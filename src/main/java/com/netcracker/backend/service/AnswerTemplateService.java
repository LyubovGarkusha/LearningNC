package com.netcracker.backend.service;

import com.netcracker.backend.entity.AnswerTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AnswerTemplateService {
    public List<AnswerTemplate> getAnswersForQuestion(long idQuestion);
    public AnswerTemplate add(AnswerTemplate answerTemplate);
}
