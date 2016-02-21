package com.itheima11.gyl.login.dao;

import com.itheima11.gyl.domain.basedata.User;

public interface LoginDao {
	public User authentication(String username,String password);
}
