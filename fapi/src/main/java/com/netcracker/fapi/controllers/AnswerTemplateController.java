package com.netcracker.fapi.controllers;


import com.netcracker.fapi.entity.AnswerTemplate;
import com.netcracker.fapi.services.AnswerTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/question")
public class AnswerTemplateController {

    @Autowired
    private AnswerTemplateService answerTemplateService;

    @RequestMapping(value = "/{idQuestion}", method = RequestMethod.GET)
    public List<AnswerTemplate> getAnswersForQuestion(@PathVariable long idQuestion){
        return answerTemplateService.getAnswersForQuestion(idQuestion);
    }

}
