package com.itheima11.gyl.basedata.dao.impl;

import org.springframework.stereotype.Repository;

import com.itheima11.gyl.base.dao.impl.BaseDaoImpl;
import com.itheima11.gyl.basedata.dao.DepartmentDao;
import com.itheima11.gyl.domain.basedata.Department;

@Repository("departmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao{

}
