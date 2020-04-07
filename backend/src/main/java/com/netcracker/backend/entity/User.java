package com.netcracker.backend.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.netcracker.backend.enums.Role;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    private long id;
    private Role role;
    private String name;
    private Login login;
    private List<Quiz> quizList;
    private List<AnswerSubmitted> answerSubmittedList;

    @Basic
    @OneToMany(mappedBy = "answerTemplate")
    @JsonManagedReference(value = "user-subanswer")
    public List<AnswerSubmitted> getAnswerSubmittedList() {
        return answerSubmittedList;
    }

    public void setAnswerSubmittedList(List<AnswerSubmitted> answerSubmittedList) {
        this.answerSubmittedList = answerSubmittedList;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "role")
    @Enumerated(EnumType.STRING)
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @OneToOne( mappedBy = "user")
    @JsonManagedReference(value = "user-login")
    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    @Basic
    @OneToMany(mappedBy = "user")
    @JsonManagedReference(value = "user-quiz")
    public List<Quiz> getQuizList() {
        return quizList;
    }

    public void setQuizList(List<Quiz> quizList) {
        this.quizList = quizList;
    }


}
