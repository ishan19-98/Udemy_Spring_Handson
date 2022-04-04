package com.in28minutes.database.databasedemo.jdbc;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import com.in28minutes.database.databasedemo.*;
import com.in28minutes.database.databasedemo.entity.Person;

@Repository
public class PersonJdbcDao {
    
	@Autowired
	JdbcTemplate jdbctemplate;
	
	public List<Person> findAll()
	{
		return jdbctemplate.query("Select * from Person", new BeanPropertyRowMapper(Person.class));
	}
	
	public Person findById(int id)
	{
 return jdbctemplate.queryForObject("Select * from Person where id=? ",new Object[]{id} ,new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public List<Person> findByName(String Name)
	{
 return jdbctemplate.query("Select * from Person where name=? ",new Object[]{Name} ,new BeanPropertyRowMapper<Person>(Person.class));
	}
	
	public int deleteById(int id)
	{
        return jdbctemplate.update("delete from Person where id=? ",new Object[]{id});
	}

	public int deleteByName(String name)
	{
        return jdbctemplate.update("delete from Person where name=?",new Object[]{name});
	}
	
	public int insert(Person person)
	{
        return jdbctemplate.update(" Insert into Person (id,name,location,birthDate)\r\n"
        		+ "values(?,?,?,?)",new Object[]{person.getId(),person.getName(),person.getLocation(),new Timestamp( person.getBirthdate().getTime())});
	}
	
	public int update(Person person)
	{
        return jdbctemplate.update("Update Person set name=?,location=?,birthdate=? where id=? ",new Object[]{person.getName(),person.getLocation(),new Timestamp(person.getBirthdate().getTime()) ,person.getId()});
	}
}
