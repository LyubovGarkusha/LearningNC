package com.netcracker.backend.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Question {
    private long id;
    private String description;
    private String questionType;
    private Boolean nessesary;
    private Quiz quiz;
    private List<AnswerTemplate> answerTemplates;
    //@JsonIgnoreProperties("question")
    private List<AnswerSubmitted> answerSubmittedList;

    @Basic
    @OneToMany(mappedBy = "question",cascade=CascadeType.ALL)
    @JsonManagedReference(value = "question-subanswer")
    public List<AnswerSubmitted> getAnswerSubmittedList() {
        return answerSubmittedList;
    }

    public void setAnswerSubmittedList(List<AnswerSubmitted> answerSubmittedList) {
        this.answerSubmittedList = answerSubmittedList;
    }

    @Basic
    @OneToMany(mappedBy = "question",cascade=CascadeType.ALL)
    @JsonManagedReference(value = "question-answer")
    public List<AnswerTemplate> getAnswerTemplates() {
        return answerTemplates;
    }

    public void setAnswerTemplates(List<AnswerTemplate> answerTemplates) {
        this.answerTemplates = answerTemplates;
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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "question_type")
    public String getQuestionType() {
        return questionType;
    }

    public void setQuestionType(String questionType) {
        this.questionType = questionType;
    }

    @Basic
    @Column(name = "nessesary")
    public Boolean getNessesary() {
        return nessesary;
    }

    public void setNessesary(Boolean nessesary) {
        this.nessesary = nessesary;
    }

    @Basic
    @ManyToOne(optional = false)
    @JoinColumn(name = "quiz_id")
    @JsonBackReference(value = "quiz-question")
    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
    }
}
