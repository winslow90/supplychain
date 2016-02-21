package com.itheima11.gyl.basedata.dao.impl;

import org.springframework.stereotype.Repository;

import com.itheima11.gyl.base.dao.impl.BaseDaoImpl;
import com.itheima11.gyl.basedata.dao.UserDao;
import com.itheima11.gyl.domain.basedata.User;

@Repository("userDao")
public class UserDaoImpl extends BaseDaoImpl<User> implements UserDao{

}
