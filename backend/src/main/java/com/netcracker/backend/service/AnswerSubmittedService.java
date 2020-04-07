package com.netcracker.backend.service;

import com.netcracker.backend.entity.AnswerSubmitted;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface AnswerSubmittedService {
    public List<AnswerSubmitted> getAnswersByQuiz(long quizId);
}
