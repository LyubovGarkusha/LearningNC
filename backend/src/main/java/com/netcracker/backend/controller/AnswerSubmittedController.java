package com.netcracker.backend.controller;

import com.netcracker.backend.entity.AnswerSubmitted;
import com.netcracker.backend.service.AnswerSubmittedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/answers")
public class AnswerSubmittedController {

    @Autowired
    private AnswerSubmittedService answerSubmittedService;

    @RequestMapping(value = "/{quizId}", method = RequestMethod.GET)
    public List<AnswerSubmitted> getAnswersForQuiz(@PathVariable(name = "quizId") int quizId){
        return answerSubmittedService.getAnswersByQuiz(quizId);
    }
}
