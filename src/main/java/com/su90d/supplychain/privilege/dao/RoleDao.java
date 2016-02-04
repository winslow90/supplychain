/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.privilege.dao;

import com.su90d.supplychain.base.dao.BaseDao;
import com.su90d.supplychain.domain.privilege.Role;
import java.util.Collection;

/**
 *
 * @author superman90
 */
public interface RoleDao extends BaseDao<Role>{
	public Role getRoleByName(final String name);
	public Collection<Role> getRoleByUid(Long uid);
}
