package com.itheima11.gyl.business.xsgl.dao;

import java.util.List;

import com.itheima11.gyl.base.dao.BaseDao;
import com.itheima11.gyl.domain.business.xsgl.Xsfhdzhib;

public interface XsfhdzhibDao extends BaseDao<Xsfhdzhib>{
	public List<Xsfhdzhib> getXsfhdzhibByCondition(String ytdjh,Long ythh);
}
