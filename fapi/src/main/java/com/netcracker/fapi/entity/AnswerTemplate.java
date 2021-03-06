package com.netcracker.fapi.entity;

import java.util.List;


public class  AnswerTemplate {
    private long id;
    private String answerText;
    private Question question;
    private List<AnswerSubmitted> answerSubmittedList;

    public AnswerTemplate(long id, String answerText, Question question, List<AnswerSubmitted> answerSubmittedList) {
        this.id = id;
        this.answerText = answerText;
        this.question = question;
        this.answerSubmittedList = answerSubmittedList;
    }

    public AnswerTemplate(){

    }

    public List<AnswerSubmitted> getAnswerSubmittedList() {
        return answerSubmittedList;
    }

    public void setAnswerSubmittedList(List<AnswerSubmitted> answerSubmittedList) {
        this.answerSubmittedList = answerSubmittedList;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
