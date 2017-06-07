package com.xawl.study.service.impl;

import org.springframework.stereotype.Service;

import com.xawl.study.dao.InterestMapper;
import com.xawl.study.model.Interest;
import com.xawl.study.service.InterestService;

@Service
public class InterestServiceImpl implements InterestService {

	private InterestMapper interestMapper;
	@Override
	public Interest get(int i) {
		return interestMapper.selectByPrimaryKey(i);
	}
}
