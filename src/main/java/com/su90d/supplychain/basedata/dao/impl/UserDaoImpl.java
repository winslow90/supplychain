/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.basedata.dao.impl;

import com.su90d.supplychain.base.dao.impl.BaseDaoImpl;
import com.su90d.supplychain.basedata.dao.UserDao;
import com.su90d.supplychain.domain.basedata.User;
import org.springframework.stereotype.Repository;

/**
 *
 * @author superman90
 */
@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao {
    
}
