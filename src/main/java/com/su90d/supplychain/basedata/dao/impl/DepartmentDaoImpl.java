/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.basedata.dao.impl;

import com.su90d.supplychain.base.dao.impl.BaseDaoImpl;
import com.su90d.supplychain.basedata.dao.DepartmentDao;
import com.su90d.supplychain.domain.basedata.Department;
import org.springframework.stereotype.Repository;

/**
 *
 * @author superman90
 */
@Repository("departmentDao")
public class DepartmentDaoImpl extends BaseDaoImpl<Department> implements DepartmentDao {
    
}
