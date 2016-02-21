package com.itheima11.gyl.login.service;

import com.itheima11.gyl.domain.basedata.User;

public interface LoginService {
	public User authentication(String username,String password);
}
