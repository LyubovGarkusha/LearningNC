package com.netcracker.fapi.services;



import com.netcracker.fapi.entity.AnswerTemplate;

import java.util.List;

public interface AnswerTemplateService {
    public List<AnswerTemplate> getAnswersForQuestion(long idQuestion);
}

