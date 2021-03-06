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
    @JsonBackReference(value = "question-subanswer")
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    @Basic
    @ManyToOne(optional = false)
    @JoinColumn(name = "quiz_id")
    @JsonBackReference(value = "quiz-subanswer")
    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
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
    @ManyToOne(optional = true)
    @JoinColumn(name = "user_id")
    @JsonBackReference(value = "user-subanswer")
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
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
    @JsonBackReference(value = "answer-subanswer")
    public AnswerTemplate getAnswerTemplate() {
        return answerTemplate;
    }

    public void setAnswerTemplate(AnswerTemplate answerTemplate) {
        this.answerTemplate = answerTemplate;
    }
}
