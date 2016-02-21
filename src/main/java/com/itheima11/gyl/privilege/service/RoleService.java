package com.itheima11.gyl.privilege.service;

import java.util.Collection;

import com.itheima11.gyl.base.service.BaseService;
import com.itheima11.gyl.domain.privilege.Role;

public interface RoleService extends BaseService<Role>{
	public Role getRoleByName(String name);
	public Collection<Role> getRoleByUid(Long uid);
}
