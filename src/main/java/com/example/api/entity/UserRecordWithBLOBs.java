package com.example.api.entity;

public class UserRecordWithBLOBs extends UserRecord {
    private String questionError;

    private String questionCollect;

    public String getQuestionError() {
        return questionError;
    }

    public void setQuestionError(String questionError) {
        this.questionError = questionError == null ? null : questionError.trim();
    }

    public String getQuestionCollect() {
        return questionCollect;
    }

    public void setQuestionCollect(String questionCollect) {
        this.questionCollect = questionCollect == null ? null : questionCollect.trim();
    }
}