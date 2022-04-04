package com.in28minutes.database.databasedemo;


import java.util.Date;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class JpaDemoApplication2 implements CommandLineRunner {
    
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	PersonJpaRepository persondao;
	
	public static void main(String[] args)  {
		SpringApplication.run(JpaDemoApplication2.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//logger.info("New -> {}",persondao.findAll());
		//logger.info("Update -> {}",persondao.insert(new Person(4,"Anna", "Monaco",new Date())));
	}

}
//logger.info("User Name-Ishan -> {}",repository.findByName("Ayush"));
//  logger.info("Insert -> {}",repository.insert(new Person("Arjun","UK",new Date())));
/*  logger.info("New -> {}",persondao.findAll());

//logger.info("delete where id=1 -> {}",persondao.deleteById(1));
logger.info("delete where name=Ishan -> {}",persondao.deleteByName("Ishan"));



logger.info("Update -> {}",persondao.update(new Person(4,"Anna", "Monaco",new Date())));*/
