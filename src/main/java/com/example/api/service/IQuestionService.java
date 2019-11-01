package com.example.api.service;

import com.example.api.entity.QuestionWithBLOBs;

import java.util.List;

public interface IQuestionService {

    public List<QuestionWithBLOBs> getQuestion(int levelId, int typeId);
}
