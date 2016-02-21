package com.itheima11.gyl.privilege.dao;

import java.util.Collection;

import com.itheima11.gyl.base.dao.BaseDao;
import com.itheima11.gyl.domain.privilege.Privilege;

public interface PrivilegeDao extends BaseDao<Privilege>{
	public Collection<Privilege> getPrivilegesByRid(Long rid);
	
	public Collection<Privilege> getMenuitemTreeByUid(Long uid);
	
	public Collection<Privilege> getFunctionByUid(Long uid);
}
