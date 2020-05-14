package com.netcracker.fapi.entity;


import com.netcracker.fapi.enums.Role;

import java.util.List;


public class User {
    private long id;
    private Role role;
    private String name;
    private Login login;
    private List<Quiz> quizList;
    private List<AnswerSubmitted> answerSubmittedList;

    public User(long id, Role role, String name, Login login, List<Quiz> quizList, List<AnswerSubmitted> answerSubmittedList) {
        this.id = id;
        this.role = role;
        this.name = name;
        this.login = login;
        this.quizList = quizList;
        this.answerSubmittedList = answerSubmittedList;
    }

    public User(){

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


    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }


    public List<Quiz> getQuizList() {
        return quizList;
    }

    public void setQuizList(List<Quiz> quizList) {
        this.quizList = quizList;
    }


}
