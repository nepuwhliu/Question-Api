package com.example.api.service.impl;

import com.example.api.dao.LevelMapper;
import com.example.api.dao.LevelTypeMapper;
import com.example.api.dao.QuestionMapper;
import com.example.api.dao.QuestionTypeMapper;
import com.example.api.entity.Level;
import com.example.api.entity.LevelType;
import com.example.api.entity.QuestionType;
import com.example.api.service.IIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @program: Question-Api->IndexServiceImpl
 * @description: Index实现类
 * @author: whLiu
 * @create: 2019-10-15 11:40
 **/
@Service
public class IndexServiceImpl implements IIndexService {

    @Autowired
    private LevelMapper levelMapper;
    @Autowired
    private QuestionTypeMapper questionTypeMapper;
    @Autowired
    private LevelTypeMapper levelTypeMapper;

    @Override
    public List<Level> getQuestionLevel() {
        return levelMapper.selectAll();
    }

    @Override
    public Level getQuestionLevelByLevelName(String levelName) {
        return levelMapper.selectByLevelName(levelName);
    }

    @Override
    public List<QuestionType> getQuestionType() {
        return questionTypeMapper.selectAll();
    }

    @Override
    public QuestionType getQuestionTypeByTypeName(String typeName) {
        return questionTypeMapper.selectByTypeName(typeName);
    }

    @Override
    public List<LevelType> getQuestionLevelType() {
        return levelTypeMapper.selectAll();
    }
}
