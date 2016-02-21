package com.itheima11.gyl.privilege.dao;

import java.util.Collection;

import com.itheima11.gyl.base.dao.BaseDao;
import com.itheima11.gyl.domain.privilege.Role;

public interface RoleDao extends BaseDao<Role>{
	public Role getRoleByName(final String name);
	public Collection<Role> getRoleByUid(Long uid);
}
