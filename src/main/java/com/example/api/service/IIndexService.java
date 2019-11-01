package com.example.api.service;

import com.example.api.entity.Level;
import com.example.api.entity.LevelType;
import com.example.api.entity.QuestionType;

import java.util.List;

/**
 * @program: Question-Api->IIndexService
 * @description: Index 接口
 * @author: whLiu
 * @create: 2019-10-15 11:39
 **/
public interface IIndexService {

    public List<Level> getQuestionLevel();

    public Level getQuestionLevelByLevelName(String levelName);

    public List<QuestionType> getQuestionType();

    public QuestionType getQuestionTypeByTypeName(String typeName);

    public List<LevelType> getQuestionLevelType();
}
