package com.netcracker.backend.controller;

import com.netcracker.backend.entity.AnswerTemplate;
import com.netcracker.backend.service.AnswerTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/api/question")
public class AnswerTemplateController {

    @Autowired
    private AnswerTemplateService answerTemplateService;

    @RequestMapping(value = "/{questionId}", method = RequestMethod.GET)
    public List<AnswerTemplate> getQuestion(@PathVariable(name = "questionId") int questionId){
        return answerTemplateService.getAnswersForQuestion(questionId);
    }

    @RequestMapping(value = "/all", method = RequestMethod.POST)
    public AnswerTemplate addAnswerTemplate(@RequestBody AnswerTemplate answerTemplate){
        return answerTemplateService.add(answerTemplate);
    }
}
