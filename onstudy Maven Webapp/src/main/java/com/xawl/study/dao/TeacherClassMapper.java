package com.xawl.study.dao;

import com.xawl.study.model.TeacherClass;

public interface TeacherClassMapper {
    int deleteByPrimaryKey(Integer tid);

    int insert(TeacherClass record);

    int insertSelective(TeacherClass record);

    TeacherClass selectByPrimaryKey(Integer tid);

    int updateByPrimaryKeySelective(TeacherClass record);

    int updateByPrimaryKey(TeacherClass record);
}