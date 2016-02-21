package com.itheima11.gyl.basedata.test;

import org.junit.Test;

import com.itheima11.gyl.basedata.action.DepartmentAction;
import com.itheima11.gyl.basedata.dao.DepartmentDao;
import com.itheima11.gyl.basedata.service.DepartmentService;
import com.itheima11.gyl.domain.basedata.Department;
import com.itheima11.gyl.query.PageResult;
import com.itheima11.gyl.query.basedata.DepartmentQuery;
import com.itheima11.gyl.test.utils.SpringUtils;

public class DepartmentTest extends SpringUtils{
	@Test
	public void testGetCount(){
		DepartmentDao departmentDao = (DepartmentDao)context.getBean("departmentDao");
		DepartmentQuery baseQuery = new DepartmentQuery();
		int count = departmentDao.getCount(baseQuery);
		System.out.println(count);
	}
	
	@Test
	public void testPageResult(){
		DepartmentDao departmentDao = (DepartmentDao)context.getBean("departmentDao");
		DepartmentQuery baseQuery = new DepartmentQuery();
		baseQuery.setCurrentPage(2);
		PageResult<Department> pageResult = departmentDao.findPageResult(baseQuery);
		for (Department department : pageResult.getRows()) {
			System.out.println(department.getDid());
		}
	}
	
	@Test
	public void testSaveDepartment(){
		DepartmentService departmentService = (DepartmentService)context.getBean("departmentService");
		Department t = new Department();
		t.setName("销售部");
		t.setDescription("公司命脉");
		departmentService.saveEntry(t);
	}
	
	@Test
	public void testAction(){
		DepartmentAction departmentAction = (DepartmentAction)context.getBean("departmentAction");
		departmentAction.showPageResult();
	}
}
