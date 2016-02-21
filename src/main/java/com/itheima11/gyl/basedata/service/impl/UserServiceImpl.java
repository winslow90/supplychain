package com.itheima11.gyl.basedata.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima11.gyl.base.dao.BaseDao;
import com.itheima11.gyl.base.service.impl.BaseServiceImpl;
import com.itheima11.gyl.basedata.dao.UserDao;
import com.itheima11.gyl.basedata.service.UserService;
import com.itheima11.gyl.domain.basedata.User;

@Service("userService")
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService{
	@Resource(name="userDao")
	private UserDao userDao;
	@Override
	public BaseDao getBaseDao() {
		// TODO Auto-generated method stub
		return this.userDao;
	}
	
}
