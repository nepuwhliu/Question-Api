package com.example.api.service.impl;


import com.example.api.dao.QuestionMapper;
import com.example.api.entity.QuestionWithBLOBs;
import com.example.api.service.IQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements IQuestionService {

    @Autowired
    private QuestionMapper questionMapper;

    @Override
    public List<QuestionWithBLOBs> getQuestion(int levelId, int typeId) {
        return questionMapper.selectQuestionByLevelIdAndTypeId(levelId, typeId);
    }
}
