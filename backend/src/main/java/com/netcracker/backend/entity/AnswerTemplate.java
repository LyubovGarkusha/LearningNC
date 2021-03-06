package com.netcracker.backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class AnswerTemplate {
    private long id;
    private String answerText;
    private Question question;
    private List<AnswerSubmitted> answerSubmittedList;

    @Basic
    @OneToMany(mappedBy = "answerTemplate",cascade=CascadeType.ALL)
    @JsonManagedReference(value = "answer-subanswer")
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
    @Column(name = "answer_text")
    public String getAnswerText() {
        return answerText;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }

    @Basic
    @ManyToOne(optional = false)
    @JoinColumn(name = "question_id")
    @JsonBackReference(value = "question-answer")
    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
