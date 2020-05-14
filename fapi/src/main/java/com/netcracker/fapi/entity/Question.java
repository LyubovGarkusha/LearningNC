package com.netcracker.fapi.entity;

import java.util.List;


public class Question {
    private long id;
    private String description;
    private String questionType;
    private Boolean nessesary;
    private Quiz quiz;
    private List<AnswerTemplate> answerTemplates;
    private List<AnswerSubmitted> answerSubmittedList;

    public Question(long id, String description, String questionType, Boolean nessesary, Quiz quiz, List<AnswerTemplate> answerTemplates, List<AnswerSubmitted> answerSubmittedList) {
        this.id = id;
        this.description = description;
        this.questionType = questionType;
        this.nessesary = nessesary;
        this.quiz = quiz;
        this.answerTemplates = answerTemplates;
        this.answerSubmittedList = answerSubmittedList;
    }

    public Question(){

    }

    public List<AnswerSubmitted> getAnswerSubmittedList() {
        return answerSubmittedList;
    }

    public void setAnswerSubmittedList(List<AnswerSubmitted> answerSubmittedList) {
        this.answerSubmittedList = answerSubmittedList;
    }


    public List<AnswerTemplate> getAnswerTemplates() {
        return answerTemplates;
    }

    public void setAnswerTemplates(List<AnswerTemplate> answerTemplates) {
        this.answerTemplates = answerTemplates;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }


    public Boolean getNessesary() {
        return nessesary;
    }

    public void setNessesary(Boolean nessesary) {
        this.nessesary = nessesary;
    }


    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
}
