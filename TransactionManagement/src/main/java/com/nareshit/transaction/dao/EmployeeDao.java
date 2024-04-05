package com.nareshit.transaction.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.transaction.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
