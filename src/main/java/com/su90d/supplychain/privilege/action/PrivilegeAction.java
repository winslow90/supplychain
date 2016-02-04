/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.privilege.action;

import com.opensymphony.xwork2.ActionContext;
import com.su90d.supplychain.base.action.BaseAction;
import com.su90d.supplychain.domain.privilege.Privilege;
import com.su90d.supplychain.domain.privilege.Role;
import com.su90d.supplychain.privilege.service.PrivilegeService;
import com.su90d.supplychain.privilege.service.RoleService;
import java.util.Collection;
import java.util.Set;
import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author superman90
 */
@Controller("privilegeAction")
@Scope("prototype")
public class PrivilegeAction extends BaseAction<Privilege>{
	@Resource(name="privilegeService")
	private PrivilegeService privilegeService;
	@Resource(name="roleService")
	private RoleService roleService;
	
	private Long rid;//角色id
	private String checkedStr;//被选中的权限节点的id的字符串  "1,2,3"
	
	
	public Long getRid() {
		return rid;
	}

	public void setRid(Long rid) {
		this.rid = rid;
	}

        @Override
	public String getCheckedStr() {
		return checkedStr;
	}

        @Override
	public void setCheckedStr(String checkedStr) {
		this.checkedStr = checkedStr;
	}

	public String showPrivilegeTree() throws Exception{
		Collection<Privilege> privileges = this.privilegeService.getPrivilegesByRoleid(this.getRid());
		ActionContext.getContext().getValueStack().push(privileges);
		Thread.sleep(1000L);
		return SUCCESS;
	}
	
	public String savePrivilege(){
		//根据rid获取到role
		Role role = this.roleService.getEntryById(rid);
		//获取到被选中的权限的集合
		Set<Privilege> privileges = this.privilegeService.getEntriesByIds(this.checkedStr.split(","));
		//建立角色与权限之间的关系
		role.setPrivileges(privileges);
		this.roleService.updateEntry(role);
		return SUCCESS;
	}
}
