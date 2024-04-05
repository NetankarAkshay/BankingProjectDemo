package com.nareshit.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.transaction.dao.InsuranceDao;
import com.nareshit.transaction.model.Insurance;

@Service
public class InsuranceService {
	
	@Autowired
	private InsuranceDao insDao;
	
	public Insurance saveInsurance(Insurance insObj) {
		return insDao.save(insObj);
	}

}
