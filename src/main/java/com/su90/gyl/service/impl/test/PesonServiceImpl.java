package com.su90.gyl.service.impl.test;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.su90.gyl.dao.test.PersonDao;
import com.su90.gyl.domain.test.Person;
import com.su90.gyl.service.test.PersonService;

@Service("personService")
public class PesonServiceImpl implements PersonService{
	@Resource(name="personDao")
	private PersonDao personDao;
	@Transactional(readOnly=false)
	public void savePerson(Person person) {
		// TODO Auto-generated method stub
		this.personDao.save(person);
	}
}
