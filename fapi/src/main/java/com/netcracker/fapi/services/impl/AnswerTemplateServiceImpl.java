package com.netcracker.fapi.services.impl;

import com.netcracker.fapi.entity.AnswerTemplate;
import com.netcracker.fapi.services.AnswerTemplateService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class AnswerTemplateServiceImpl implements AnswerTemplateService {

    @Value("${backend.server.url}")
    private String backendUrl;

    @Override
    public List<AnswerTemplate> getAnswersForQuestion(long idQuestion){
        RestTemplate restTemplate = new RestTemplate();
        AnswerTemplate[] answerTemplates = restTemplate.getForObject(backendUrl + "/api/question/" + idQuestion, AnswerTemplate[].class);
        return Arrays.asList(answerTemplates);
    }

//    @Override
//    public AnswerTemplate addAnswerTemplate(AnswerTemplate answerTemplate){
//        RestTemplate restTemplate = new RestTemplate();
//        AnswerTemplate[] answerTemplates = restTemplate.getForObject(backendUrl + "")
//    }


//    @Override
//    public List<AnswerTemplate> deleteAnswerForQuestion(long idAnswer){
//
//    }

}
