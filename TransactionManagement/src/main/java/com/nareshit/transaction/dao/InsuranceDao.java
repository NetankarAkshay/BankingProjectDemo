package com.nareshit.transaction.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.transaction.model.Insurance;

@Repository
public interface InsuranceDao extends JpaRepository<Insurance, Integer>{

}
