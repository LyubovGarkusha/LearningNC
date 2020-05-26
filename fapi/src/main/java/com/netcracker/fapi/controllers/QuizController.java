package com.netcracker.fapi.controllers;

import com.netcracker.fapi.entity.Quiz;
import com.netcracker.fapi.services.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/quiz")
public class QuizController {

    @Autowired
    private QuizService quizService;

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping( value = "/all", method = RequestMethod.GET)
    public List<Quiz> getAll(){
        return quizService.getAllQuiz();
    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    @RequestMapping( value = "/all/{id}", method = RequestMethod.DELETE)
    public void deleteQuiz(@PathVariable(name = "id") Long id) {
        quizService.deleteQuiz(id);
    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    @RequestMapping(value = "/all", method = RequestMethod.POST)
    public Quiz addAnswerTemplate(@RequestBody Quiz quiz){
        return quizService.add(quiz);
    }

    @PreAuthorize("hasRole('ADMIN') or hasRole('USER')")
    @RequestMapping(value = "/all/{id}", method = RequestMethod.GET)
    public Quiz getQuizById(@PathVariable(name = "id") Long id) {
        return quizService.getQuizById(id);
    }


}

