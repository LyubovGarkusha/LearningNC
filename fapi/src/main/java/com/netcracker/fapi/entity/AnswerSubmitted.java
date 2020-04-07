package com.netcracker.fapi.entity;


public class AnswerSubmitted {
    private long id;
    private User user;
    private String answerText;
    private AnswerTemplate answerTemplate;
    private Question question;
    private Quiz quiz;


    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }


    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User userId) {
        this.user = user;
    }


    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }


    public AnswerTemplate getAnswerTemplate() {
        return answerTemplate;
    }

    public void setAnswerTemplate(AnswerTemplate answerTemplate) {
        this.answerTemplate = answerTemplate;
    }
}
