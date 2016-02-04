/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.basedata.service.impl;

import com.su90d.supplychain.base.dao.BaseDao;
import com.su90d.supplychain.base.service.impl.BaseServiceImpl;
import com.su90d.supplychain.basedata.dao.UserDao;
import com.su90d.supplychain.basedata.service.UserService;
import com.su90d.supplychain.domain.basedata.User;
import javax.annotation.Resource;
import org.springframework.stereotype.Repository;

/**
 *
 * @author superman90
 */
@Repository("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {
    @Resource(name="userDao")
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public BaseDao getBaseDao() {
        return this.userDao;
    }
    
}
