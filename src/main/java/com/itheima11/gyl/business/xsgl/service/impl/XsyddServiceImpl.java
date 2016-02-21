package com.itheima11.gyl.business.xsgl.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima11.gyl.base.dao.BaseDao;
import com.itheima11.gyl.business.base.service.impl.BaseBusinessServiceImpl;
import com.itheima11.gyl.business.xsgl.dao.XsyddzhibDao;
import com.itheima11.gyl.business.xsgl.dao.XsyddzhubDao;
import com.itheima11.gyl.business.xsgl.service.XsyddService;
import com.itheima11.gyl.domain.business.xsgl.Xsyddzhib;
import com.itheima11.gyl.domain.business.xsgl.Xsyddzhub;

@Service("xsyddService")
public class XsyddServiceImpl extends BaseBusinessServiceImpl<Xsyddzhub, Xsyddzhib> implements XsyddService{
	@Resource(name="xsyddzhubDao")
	private XsyddzhubDao xsyddzhubDao;
	@Resource(name="xsyddzhibDao")
	private XsyddzhibDao xsyddzhibDao;
	@Override
	public BaseDao<Xsyddzhub> getBaseDao_zhu() {
		// TODO Auto-generated method stub
		return this.xsyddzhubDao;
	}
	@Override
	public BaseDao<Xsyddzhib> getBaseDao_zhi() {
		// TODO Auto-generated method stub
		return this.xsyddzhibDao;
	}
}
