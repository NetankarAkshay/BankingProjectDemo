package com.nareshit.advjpa;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nareshit.advjpa.model.Person;
import com.nareshit.advjpa.service.PersonService;

@SpringBootApplication
public class CollectionsUsingCrudRepoApplication implements CommandLineRunner{
	
	
	@Autowired
	private PersonService personService;

	public static void main(String[] args) {
		SpringApplication.run(CollectionsUsingCrudRepoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		createPersons();
		
	}
	
	private void createPersons() {

		/*
		 * List<Person> personList=new ArrayList<Person>();
		 *
		 * personList.add(new Person("Kiran", "kumar", "kiran@gmail.com", 20));
		 *
		 * personList.add(new Person("Kiran1", "kumar", "kiran@gmail.com", 20));
		 *
		 * personList.add(new Person("Kiran2", "kumar", "kiran@gmail.com", 20));
		 * personList.add(new Person("Kiran3", "kumar", "kiran@gmail.com", 20));
		 * personList.add(new Person("Kiran4", "kumar", "kiran@gmail.com", 20));
		 * personList.add(new Person("Kiran5", "kumar", "kiran@gmail.com", 20));
		 * personList.add(new Person("Kiran7", "kumar", "kiran@gmail.com", 20));
		 * personList.add(new Person("Kiran8", "kumar", "kiran@gmail.com", 20));
		 *
		 * personService.saveAllpersons(personList);
		 *
		 * personList=null;
		 */


		//List<Person> personList=new ArrayList<Person>();
		//Person per=new Person();

		List<Person> personList = Arrays.asList(
				new Person("Kiran", "kumar", "kiran@gmail.com", 20),
				new Person("Ram", "kumar", "ram@gmail.com", 22),
				new Person("RamKiran", "LaxmiKiran", "sita@gmail.com", 30),
				new Person("Lakshamn", "Seth", "seth@gmail.com", 50),
				new Person("Sita", "Kumar", "lakshman@gmail.com", 50),
				new Person("Ganesh", "Kumar", "ganesh@gmail.com", 50),
				new Person("KiranKiran", "kumar", "kiran@yahoo.com", 20),
				new Person("RamRam", "kumar", "ram@yahoo.com", 22),
				new Person("RamKiranRamKiran", "LaxmiKiran", "sita@yahoo.com", 30),
				new Person("RamKiranRamKiran", "Seth", "seth@yahoo.com", 50),
				new Person("SitaSita", "Kumar", "lakshman@yahoo.com", 50),
				new Person("GaneshSita", "Kumar", "ganesh@yahoo.com", 50));

		Iterable<Person> list = personService.saveAllPersons(personList);
		for (Person person : list) {
			System.out.println("Person Object" + person.toString());

		}
	}

}
