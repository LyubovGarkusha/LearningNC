package com.netcracker.fapi.services;



import com.netcracker.fapi.entity.AnswerTemplate;

import java.util.List;

public interface AnswerTemplateService {
    public List<AnswerTemplate> getAnswersForQuestion(long idQuestion);
//    public List<AnswerTemplate> deleteAnswerForQuestion(long idAnswer);
//    public AnswerTemplate addAnswerTemplate(AnswerTemplate answerTemplate);
}

