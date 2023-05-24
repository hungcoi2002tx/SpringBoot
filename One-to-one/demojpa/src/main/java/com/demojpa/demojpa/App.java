package com.demojpa.demojpa;



import org.hibernate.sql.Select;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class App {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(App.class, args);

		PersonRepository repository = context.getBean(PersonRepository.class);



		repository.findByFirstName("firstname1").forEach(System.out::println);
		repository.findByFirstNameContaining("firstname1").forEach(System.out::println);
		
	}

}
