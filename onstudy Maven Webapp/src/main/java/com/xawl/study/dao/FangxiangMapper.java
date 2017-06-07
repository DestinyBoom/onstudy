package com.xawl.study.dao;

import com.xawl.study.model.Fangxiang;

public interface FangxiangMapper {
    int deleteByPrimaryKey(Integer fid);

    int insert(Fangxiang record);

    int insertSelective(Fangxiang record);

    Fangxiang selectByPrimaryKey(Integer fid);

    int updateByPrimaryKeySelective(Fangxiang record);

    int updateByPrimaryKey(Fangxiang record);
}