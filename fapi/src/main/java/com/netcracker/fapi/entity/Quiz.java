package com.netcracker.fapi.entity;



import com.netcracker.fapi.enums.Theme;

import java.sql.Date;
import java.sql.Time;
import java.util.List;

public class Quiz {
    private long id;
    private String url;
    private String quizName;
    private boolean shared;
    private Time timer;
    private Theme quizTheme;
    private User user;
    private Date creationDate;
    private Date lastModifyDate;
    private List<Question> questionList;
    private List<AnswerSubmitted> answerSubmittedList;

    public Quiz(long id, String url, String quizName, boolean shared, Time timer, Theme quizTheme, User user, Date creationDate, Date lastModifyDate, List<Question> questionList, List<AnswerSubmitted> answerSubmittedList) {
        this.id = id;
        this.url = url;
        this.quizName = quizName;
        this.shared = shared;
        this.timer = timer;
        this.quizTheme = quizTheme;
        this.user = user;
        this.creationDate = creationDate;
        this.lastModifyDate = lastModifyDate;
        this.questionList = questionList;
        this.answerSubmittedList = answerSubmittedList;
    }

    public Quiz() {
    }


    public List<AnswerSubmitted> getAnswerSubmittedList() {
        return answerSubmittedList;
    }

    public void setAnswerSubmittedList(List<AnswerSubmitted> answerSubmittedList) {
        this.answerSubmittedList = answerSubmittedList;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }


    public String getQuizName() {
        return quizName;
    }

    public void setQuizName(String quizName) {
        this.quizName = quizName;
    }

    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }


    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }


    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


    public Time getTimer() {
        return timer;
    }

    public void setTimer(Time timer) {
        this.timer = timer;
    }


    public Theme getQuizTheme() {
        return quizTheme;
    }

    public void setQuizTheme(Theme quizTheme) {
        this.quizTheme = quizTheme;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
