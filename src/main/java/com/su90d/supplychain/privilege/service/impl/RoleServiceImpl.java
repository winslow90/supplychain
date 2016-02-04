/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.privilege.service.impl;

import com.su90d.supplychain.base.dao.BaseDao;
import com.su90d.supplychain.base.service.impl.BaseServiceImpl;
import com.su90d.supplychain.domain.privilege.Role;
import com.su90d.supplychain.privilege.dao.RoleDao;
import com.su90d.supplychain.privilege.service.RoleService;
import java.util.Collection;
import javax.annotation.Resource;
import org.springframework.stereotype.Service;

/**
 *
 * @author superman90
 */
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
