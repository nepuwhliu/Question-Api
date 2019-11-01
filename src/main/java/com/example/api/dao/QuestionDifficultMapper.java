package com.example.api.dao;

import com.example.api.entity.QuestionDifficult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface QuestionDifficultMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuestionDifficult record);

    int insertSelective(QuestionDifficult record);

    QuestionDifficult selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuestionDifficult record);

    int updateByPrimaryKey(QuestionDifficult record);
}