package com.itheima11.gyl.basedata.test;

import org.junit.Test;

import com.itheima11.gyl.base.dao.BaseDao;
import com.itheima11.gyl.query.basedata.DepartmentQuery;
import com.itheima11.gyl.test.utils.SpringUtils;

public class BaseDaoTest extends SpringUtils{
	@Test
	public void testBaseDao_Count(){
		BaseDao baseDao = (BaseDao)context.getBean("baseDao");
		DepartmentQuery baseQuery = new DepartmentQuery();
		baseQuery.setName("44");
		int count = baseDao.getCount(baseQuery);
		System.out.println(count);
	}
}
