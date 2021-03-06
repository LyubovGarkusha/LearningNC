package com.netcracker.backend.controller;

import com.netcracker.backend.entity.Question;
import com.netcracker.backend.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @RequestMapping(value = "quiz/{quizId}/question/all/", method = RequestMethod.GET)
    public List<Question> getQuestionsForQuiz(@PathVariable(name = "quizId") int quizId){
        return questionService.getQuestionsForQuiz(quizId);
    }


}
