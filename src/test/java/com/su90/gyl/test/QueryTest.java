package com.su90.gyl.test;

import java.util.Date;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.su90.gyl.dao.test.PersonDao;
import com.su90.gyl.domain.test.Person;
import com.su90.gyl.query.PageResult;
import com.su90.gyl.query.PersonQuery;
import com.su90.gyl.service.test.PersonService;

public class QueryTest {
//	@Test
//	public void testQuery(){
//		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/gyl/spring/applicationContext.xml");
//		PersonDao personDao = (PersonDao)context.getBean("personDao");
//		PersonQuery query = new PersonQuery();
//		query.setTime(new Date());
//		query.setName("a");
//		PageResult<Person> pageResult = personDao.findPageResult(Person.class, query);
//		System.out.println(pageResult);
//	}
//	
//	@Test
//	public void testSave(){
//		ApplicationContext context = new ClassPathXmlApplicationContext("cn/itcast/gyl/spring/applicationContext.xml");
//		PersonService personService = (PersonService)context.getBean("personService");
//		Person person = new Person();
//		person.setPid(4L);
//		person.setName("7777");
//		person.setTime(new Date());
//		personService.savePerson(person);
//	}
}
