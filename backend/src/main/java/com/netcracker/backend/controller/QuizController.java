package com.netcracker.backend.controller;

import com.netcracker.backend.entity.Login;
import com.netcracker.backend.entity.Quiz;
import com.netcracker.backend.service.LoginService;
import com.netcracker.backend.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @RequestMapping( value = "/all", method = RequestMethod.GET)
    public List<Quiz> getAll(){
        return quizService.getAllQuiz();
    }
}
