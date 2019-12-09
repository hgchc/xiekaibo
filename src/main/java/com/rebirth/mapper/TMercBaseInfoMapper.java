package com.rebirth.mapper;

import com.rebirth.pojo.TMercBaseInfo;
import org.springframework.stereotype.Repository;

@Repository
public interface TMercBaseInfoMapper {
    int deleteByPrimaryKey(String mercId);

    int insert(TMercBaseInfo record);

    int insertSelective(TMercBaseInfo record);

    TMercBaseInfo selectByPrimaryKey(String mercId);

    int updateByPrimaryKeySelective(TMercBaseInfo record);

    int updateByPrimaryKey(TMercBaseInfo record);
}