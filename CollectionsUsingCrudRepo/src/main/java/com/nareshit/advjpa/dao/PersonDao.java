package com.nareshit.advjpa.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nareshit.advjpa.model.Person;

@Repository
public interface PersonDao extends CrudRepository<Person, Integer> {
	
	/*
	 * 
	 * saveAll  ==> Collection Datastructure 
	 * findAllById ==> Collecdtion Datastructure
	 */

}
