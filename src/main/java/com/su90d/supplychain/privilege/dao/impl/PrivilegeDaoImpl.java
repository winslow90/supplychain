/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.privilege.dao.impl;

import com.su90d.supplychain.base.dao.impl.BaseDaoImpl;
import com.su90d.supplychain.domain.privilege.Privilege;
import com.su90d.supplychain.privilege.dao.PrivilegeDao;
import java.util.Collection;
import org.springframework.stereotype.Repository;

/**
 *
 * @author superman90
 */
@Repository("privilegeDao")
public class PrivilegeDaoImpl extends BaseDaoImpl<Privilege> implements PrivilegeDao{

	@Override
	public Collection<Privilege> getPrivilegesByRid(Long rid) {
		/**
		 * 1、加载所有的权限
		 * 2、加载该角色能够访问到的权限
		 * 3、两次遍历，把所有的权限中用户能够访问到的权限的checked设置为true
		 */
		Collection<Privilege> allPrivileges = this.hibernateTemplate.find("from Privilege");
		Collection<Privilege> rolePrivileges = this.hibernateTemplate.
					find("from Privilege p inner join fetch p.roles r where r.rid=?",rid);
		for (Privilege privilege : allPrivileges) {//遍历所有的权限
			for (Privilege privilege2 : rolePrivileges) {//遍历角色的权限
				//如果当前正在遍历的所有的权限中的该项是角色能够访问到的
				if(privilege.getId().longValue()==privilege2.getId().longValue()){
					privilege.setChecked(true);
				}
			}
		}
		return allPrivileges;
	}

}