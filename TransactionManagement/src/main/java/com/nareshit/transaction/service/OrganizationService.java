package com.nareshit.transaction.service;

import javax.management.RuntimeErrorException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.transaction.model.Employee;
import com.nareshit.transaction.model.Insurance;

@Service
public class OrganizationService {
	
	@Autowired
	private EmployeeService empService;
	
	
	@Autowired
	private InsuranceService insService;
	
	
	@Transactional
	public void onBoardEmployee(Employee empObj,Insurance insObj) {
		empService.saveEmployee(empObj);
		
		if (insObj.getHealthInsuranceSchemeName().length() <= 4) {
			throw new RuntimeErrorException(null, "Error in Insurance");
		} else {
			insObj.setEmpId(empObj.getEmpId());

			insService.saveInsurance(insObj);
		}
	}

}
