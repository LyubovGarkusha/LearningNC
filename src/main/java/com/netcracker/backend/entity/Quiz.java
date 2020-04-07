package com.netcracker.backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.netcracker.backend.enums.Theme;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
public class Quiz {
    private long id;
    private String url;
    private boolean shared;
    private Time timer;
    private Theme quizTheme;
    private User user;
    private Date creationDate;
    private Date lastModifyDate;
    private List<Question> questionList;
    private List<AnswerSubmitted> answerSubmittedList;

    @Basic
    @OneToMany(mappedBy = "answerTemplate")
    @JsonManagedReference(value = "quiz-subanswer")
    public List<AnswerSubmitted> getAnswerSubmittedList() {
        return answerSubmittedList;
    }

    public void setAnswerSubmittedList(List<AnswerSubmitted> answerSubmittedList) {
        this.answerSubmittedList = answerSubmittedList;
    }

    @Basic
    @OneToMany( mappedBy = "quiz")
    @JsonManagedReference(value = "quiz-question")
    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }

    @Basic
    @Column(name = "shared")
    public boolean isShared() {
        return shared;
    }

    public void setShared(boolean shared) {
        this.shared = shared;
    }

    @Basic
    @Column(name = "creation_date")
    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    @Basic
    @Column(name = "last_modify_date")
    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
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
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "timer")
    public Time getTimer() {
        return timer;
    }

    public void setTimer(Time timer) {
        this.timer = timer;
    }

    @Basic
    @Column(name = "quiz_theme")
    @Enumerated(EnumType.STRING)
    public Theme getQuizTheme() {
        return quizTheme;
    }

    public void setQuizTheme(Theme quizTheme) {
        this.quizTheme = quizTheme;
    }

    @Basic
    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id")
    @JsonBackReference(value = "user-quiz")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
