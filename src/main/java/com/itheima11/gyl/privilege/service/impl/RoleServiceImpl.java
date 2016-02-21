package com.itheima11.gyl.privilege.service.impl;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima11.gyl.base.dao.BaseDao;
import com.itheima11.gyl.base.service.impl.BaseServiceImpl;
import com.itheima11.gyl.domain.privilege.Role;
import com.itheima11.gyl.privilege.dao.RoleDao;
import com.itheima11.gyl.privilege.service.RoleService;

@Service("roleService")
public class RoleServiceImpl extends BaseServiceImpl<Role> implements RoleService{
	@Resource(name="roleDao")
	private RoleDao roleDao;

	@Override
	public BaseDao getBaseDao() {
		// TODO Auto-generated method stub
		return this.roleDao;
	}

	@Override
	public Role getRoleByName(String name) {
		// TODO Auto-generated method stub
		return this.roleDao.getRoleByName(name);
	}

	@Override
	public Collection<Role> getRoleByUid(Long uid) {
		// TODO Auto-generated method stub
		return this.roleDao.getRoleByUid(uid);
	}	
}
