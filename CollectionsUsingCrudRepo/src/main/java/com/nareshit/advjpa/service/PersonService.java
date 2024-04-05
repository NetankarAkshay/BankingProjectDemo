package com.nareshit.advjpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nareshit.advjpa.dao.PersonDao;
import com.nareshit.advjpa.model.Person;

@Service
public class PersonService {
	
	@Autowired
	private PersonDao personDao;
	
	
	public Iterable<Person> saveAllPersons(Iterable<Person> personList){
		
		return personDao.saveAll(personList);
		/*
		 * 
		 * 
		 *  for each(Person  per:PersonList){
		 *      persondao.save(per)
		 *    }
		 */
		
	}
	
	public Iterable<Person> findPersons(Iterable<Integer> personIds){
			return personDao.findAllById(personIds);
			
			//select * from tbl_person where person_id in (1,2,3,4,5);
	}

}
