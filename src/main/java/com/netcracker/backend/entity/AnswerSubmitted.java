package com.netcracker.backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class AnswerSubmitted {
    private long id;
    private User user;
    private String answerText;
    private AnswerTemplate answerTemplate;
    private Question question;
    private Quiz quiz;

    @Basic
    @ManyToOne(optional = false)
    @JoinColumn(name = "question_id")
    @JsonBackReference
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Basic
    @ManyToOne(optional = false)
    @JoinColumn(name = "quiz_id")
    @JsonBackReference
    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @ManyToOne(optional = true)
    @JoinColumn(name = "user_id")
    @JsonBackReference
    public User getUser() {
        return user;
    }

    public void setUser(User userId) {
        this.user = user;
    }

    @Basic
    @Column(name = "answer_text")
    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    @Basic
    @ManyToOne(optional = true)
    @JoinColumn(name = "template_answer_id")
    @JsonBackReference
    public AnswerTemplate getAnswerTemplate() {
        return answerTemplate;
    }

    public void setAnswerTemplate(AnswerTemplate answerTemplate) {
        this.answerTemplate = answerTemplate;
    }
}
