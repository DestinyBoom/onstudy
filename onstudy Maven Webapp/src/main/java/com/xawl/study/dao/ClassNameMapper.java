package com.xawl.study.dao;

import com.xawl.study.model.ClassName;

public interface ClassNameMapper {
    int deleteByPrimaryKey(Integer classid);

    int insert(ClassName record);

    int insertSelective(ClassName record);

    ClassName selectByPrimaryKey(Integer classid);

    int updateByPrimaryKeySelective(ClassName record);

    int updateByPrimaryKey(ClassName record);
}