package com.example.api.entity;

public class QuestionDifficult {
    private Integer id;

    private String questionDifficult;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestionDifficult() {
        return questionDifficult;
    }

    public void setQuestionDifficult(String questionDifficult) {
        this.questionDifficult = questionDifficult == null ? null : questionDifficult.trim();
    }
}