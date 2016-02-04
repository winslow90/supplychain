/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.privilege.dao.impl;

import com.su90d.supplychain.base.dao.impl.BaseDaoImpl;
import com.su90d.supplychain.domain.privilege.Role;
import com.su90d.supplychain.privilege.dao.RoleDao;
import java.sql.SQLException;
import java.util.Collection;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.stereotype.Repository;

/**
 *
 * @author superman90
 */
@Repository("roleDao")
public class RoleDaoImpl extends BaseDaoImpl<Role> implements RoleDao{

	@Override
	public Role getRoleByName(final String name) {
		return this.hibernateTemplate.execute(new HibernateCallback<Role>() {
			@Override
			public Role doInHibernate(Session session)
					throws HibernateException, SQLException {
				Query query = session.createQuery("from Role where name=:name");
				query.setParameter("name", name);
				return (Role)query.uniqueResult();
			}
		});
	}

	@Override
	public Collection<Role> getRoleByUid(Long uid) {
		//加载所有的角色
		Collection<Role> allRoles = this.hibernateTemplate.find("from Role");
		//加载用户能够访问到的角色
		Collection<Role> userRoles = this.hibernateTemplate.
					find("from Role r inner join fetch r.users u where u.uid=?",uid);
		for (Role role : allRoles) {//遍历所有的角色
			for (Role role2 : userRoles) {//遍历用户能够访问到的角色
				if(role.getRid().longValue()==role2.getRid().longValue()){
					role.setChecked(true);//在用户能够访问到的角色的checked设置为true
				}
			}
		}
		return allRoles;
	}
}
