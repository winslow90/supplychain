/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.basedata.service.impl;

import com.su90d.supplychain.base.dao.BaseDao;
import com.su90d.supplychain.base.service.impl.BaseServiceImpl;
import com.su90d.supplychain.basedata.dao.DepartmentDao;
import com.su90d.supplychain.basedata.service.DepartmentService;
import com.su90d.supplychain.domain.basedata.Department;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author superman90
 */
@Service("departmentService")
public class DepartmentServiceImpl extends  BaseServiceImpl<Department> implements DepartmentService{
	@Resource(name="departmentDao")
	private DepartmentDao departmentDao;

    public DepartmentDao getDepartmentDao() {
        return departmentDao;
    }

    public void setDepartmentDao(DepartmentDao departmentDao) {
        this.departmentDao = departmentDao;
    }
	@Override
	public BaseDao getBaseDao() {
		// TODO Auto-generated method stub
		return this.departmentDao;
	}	
}
