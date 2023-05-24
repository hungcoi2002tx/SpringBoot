package com.demojpa.onetomany;


import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		PersonRepository repository = context.getBean(PersonRepository.class);

		AddressRepository addressRepository = context.getBean(AddressRepository.class);
		

		Person p = Person.builder().firstName("Nguyen").lastName("Hung").emailAddress("hung@gmail.com").age(20).build();
		

		Person p1 = Person.builder().firstName("Nguyen").lastName("Kha").emailAddress("kha@gmail.com").age(21).build();
		
		List<Person> persons = new ArrayList<>();
		persons.add(0, p1);
		persons.add(1, p1);
		Address address = Address.builder().address("Ha Noi").persons(persons).build();
		addressRepository.save(address);
		p1.setAddress(address);
		p.setAddress(address);
		repository.save(p);
		repository.save(p1);
		
	}

}
