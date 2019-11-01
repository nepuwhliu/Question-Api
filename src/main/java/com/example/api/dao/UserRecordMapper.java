package com.example.api.dao;

import com.example.api.entity.UserRecord;
import com.example.api.entity.UserRecordWithBLOBs;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserRecordMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserRecordWithBLOBs record);

    int insertSelective(UserRecordWithBLOBs record);

    UserRecordWithBLOBs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserRecordWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UserRecordWithBLOBs record);

    int updateByPrimaryKey(UserRecord record);
}