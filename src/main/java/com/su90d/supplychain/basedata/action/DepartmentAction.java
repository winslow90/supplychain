/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.basedata.action;

import com.opensymphony.xwork2.ActionContext;
import com.su90d.supplychain.base.action.BaseAction;
import com.su90d.supplychain.basedata.service.DepartmentService;
import com.su90d.supplychain.domain.basedata.Department;
import com.su90d.supplychain.query.PageResult;
import com.su90d.supplychain.query.basedata.DepartmentQuery;
import javax.annotation.Resource;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author superman90
 */
@Controller("departmentAction")
@Scope("prototype")
public class DepartmentAction extends BaseAction<Department>{
	@Resource(name="departmentService")
	private DepartmentService departmentService;
	private DepartmentQuery baseQuery = new DepartmentQuery();
	
	

	public String showPageResult(){
		baseQuery.setCurrentPage(this.getCurrentPage());
		PageResult<Department> departments = this.departmentService.getPageResult(baseQuery);
		ActionContext.getContext().put("departments", departments);
		return listAction;
	}
	
	public String deleteDepartments(){
		//String[] ids = this.getCheckedStr().split(",");
		this.departmentService.deleteEntriesByIds(this.getIds());
		return action2action;
	}
	
	public String addUI(){
		return addUI;
	}
	
	public String add(){
		Department department = new Department();
		BeanUtils.copyProperties(this.getModel(), department);
		this.departmentService.saveEntry(department);
		return action2action;
	}
	
	public String updateUI(){
		Department department = this.departmentService.getEntryById(this.getModel().getDid());
		ActionContext.getContext().getValueStack().push(department);
		return updateUI;
	}
	
	public String update(){
		Department department = this.departmentService.getEntryById(this.getModel().getDid());
		BeanUtils.copyProperties(this.getModel(), department);
		this.departmentService.updateEntry(department);
		return "chain";
	}
}
