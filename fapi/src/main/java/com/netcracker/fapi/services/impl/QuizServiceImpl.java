package com.netcracker.fapi.services.impl;

import com.netcracker.fapi.entity.Quiz;
import com.netcracker.fapi.services.QuizService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class QuizServiceImpl implements QuizService {

    @Value("${backend.server.url}")
    private String backendUrl;

    @Override
    public List<Quiz> getAllQuiz(){
        RestTemplate restTemplate = new RestTemplate();
        Quiz[] quizList = restTemplate.getForObject(backendUrl + "/api/quiz/all", Quiz[].class);
        return Arrays.asList(quizList);
    }

    @Override
    public void deleteQuiz(long id){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(backendUrl + "/api/quiz/all/" + id);
    }

    @Override
    public Quiz getQuizById(long id) {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(backendUrl + "/api/quiz/all/" + id, Quiz.class);
    }

    @Override
    public Quiz add(Quiz quiz){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.postForEntity(backendUrl + "/api/quiz/all", quiz, Quiz.class).getBody();

    }


}
