package com.su90.gyl.dao.impl.test;

import org.springframework.stereotype.Repository;

import com.su90.gyl.dao.base.impl.BaseDaoImpl;
import com.su90.gyl.dao.test.PersonDao;
import com.su90.gyl.domain.test.Person;

@Repository("personDao")
public class PersonDaoImpl extends BaseDaoImpl<Person> implements PersonDao{

}
