package com.in28minutes.database.databasedemo;


import java.util.Date;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;

import ch.qos.logback.classic.Logger;

//@SpringBootApplication
public class SprindJDBCDemoApplication implements CommandLineRunner {
    
	private Logger logger = (Logger) LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	PersonJdbcDao persondao;
	
	public static void main(String[] args)  {
		SpringApplication.run(SprindJDBCDemoApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	   
	   logger.info("New -> {}",persondao.findAll());
	   logger.info("User Id-1 -> {}",persondao.findById(1));
	   logger.info("User Name-Ishan -> {}",persondao.findByName("Ishan"));
	   //logger.info("delete where id=1 -> {}",persondao.deleteById(1));
	   logger.info("delete where name=Ishan -> {}",persondao.deleteByName("Ishan"));
	   
	   logger.info("Insert -> {}",persondao.insert(new Person(4,"Arjun","UK",new Date())));
	   
	   logger.info("Update -> {}",persondao.update(new Person(4,"Anna","Monaco",new Date())));


	   
	}

}
