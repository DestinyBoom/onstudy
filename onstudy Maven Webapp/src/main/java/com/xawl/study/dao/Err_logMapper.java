package com.xawl.study.dao;

import com.xawl.study.model.Err_log;

public interface Err_logMapper {
    int deleteByPrimaryKey(String id);

    int insert(Err_log record);

    int insertSelective(Err_log record);

    Err_log selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Err_log record);

    int updateByPrimaryKeyWithBLOBs(Err_log record);

    int updateByPrimaryKey(Err_log record);
}