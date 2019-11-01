package com.example.api.dao;

import com.example.api.entity.LevelType;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface LevelTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LevelType record);

    int insertSelective(LevelType record);

    LevelType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LevelType record);

    int updateByPrimaryKey(LevelType record);

    List<LevelType> selectAll();
}