package com.itheima11.gyl.business.xsgl.dao;

import java.util.List;

import com.itheima11.gyl.base.dao.BaseDao;
import com.itheima11.gyl.domain.business.xsgl.Xsddzhib;
import com.itheima11.gyl.domain.business.xsgl.Xsddzhub;

public interface XsddzhubDao extends BaseDao<Xsddzhub>{
	public List<Xsddzhib> getXsddzhibByDDH(String ddh);
	public Xsddzhub getXsddzhubByDDH(String ddh);
}
