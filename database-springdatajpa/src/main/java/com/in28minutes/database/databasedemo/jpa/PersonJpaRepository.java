package com.in28minutes.database.databasedemo.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.in28minutes.database.databasedemo.entity.Person;

@Repository
@Transactional
public class PersonJpaRepository {

	@PersistenceContext
	EntityManager entitymanager;
	
	public Person findById(int id)
	{
		return entitymanager.find(Person.class,id);
	}
	
	public Person insert(Person person)
	{
		return entitymanager.merge(person);
	}
	
	public Person update(Person person)
	{
		return entitymanager.merge(person);
	}
	
	public void deleteById(int id)
	{
		Person person1=entitymanager.find(Person.class,id);
		entitymanager.remove(person1);
	}
	
	public List<Person> findAll()
	{
		Query query= entitymanager.createNamedQuery("findAllPersons");
		return query.getResultList();
	}
}
