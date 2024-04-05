package com.nareshit.transaction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.transaction.dao.EmployeeDao;
import com.nareshit.transaction.model.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao empDao;
	
	
	public Employee saveEmployee(Employee empObj) {
		return empDao.save(empObj);
	}

}
