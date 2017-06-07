package com.xawl.study.dao;

import com.xawl.study.model.ExamResume;

public interface ExamResumeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ExamResume record);

    int insertSelective(ExamResume record);

    ExamResume selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ExamResume record);

    int updateByPrimaryKeyWithBLOBs(ExamResume record);

    int updateByPrimaryKey(ExamResume record);
}