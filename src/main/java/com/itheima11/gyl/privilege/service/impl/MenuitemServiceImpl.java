package com.itheima11.gyl.privilege.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima11.gyl.base.dao.BaseDao;
import com.itheima11.gyl.base.service.impl.BaseServiceImpl;
import com.itheima11.gyl.domain.privilege.Menuitem;
import com.itheima11.gyl.privilege.dao.MenuitemDao;
import com.itheima11.gyl.privilege.service.MenuitemService;

@Service("menuitemService")
public class MenuitemServiceImpl extends BaseServiceImpl<Menuitem> implements MenuitemService{
	@Resource(name="menuitemDao")
	private MenuitemDao menuitemDao;
	@Override
	public BaseDao getBaseDao() {
		// TODO Auto-generated method stub
		return this.menuitemDao;
	}
}
