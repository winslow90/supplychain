/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.privilege.service.impl;

import com.su90d.supplychain.base.dao.BaseDao;
import com.su90d.supplychain.base.service.impl.BaseServiceImpl;
import com.su90d.supplychain.domain.privilege.Privilege;
import com.su90d.supplychain.privilege.dao.PrivilegeDao;
import com.su90d.supplychain.privilege.service.PrivilegeService;
import java.util.Collection;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author superman90
 */
@Service("privilegeService")
public class PrivilegeServiceImpl extends BaseServiceImpl<Privilege> implements PrivilegeService{
	@Resource(name="privilegeDao")
	private PrivilegeDao privilegeDao;
	@Override
	public BaseDao getBaseDao() {
		// TODO Auto-generated method stub
		return this.privilegeDao;
	}
	@Override
	public Collection<Privilege> getPrivilegesByRoleid(Long rid) {
		// TODO Auto-generated method stub
		return this.privilegeDao.getPrivilegesByRid(rid);
	}
	
}
