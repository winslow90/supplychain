package com.itheima11.gyl.business.xsgl.service;

import java.util.List;

import com.itheima11.gyl.business.base.service.BaseBusinessService;
import com.itheima11.gyl.domain.business.xsgl.Xsfhdzhib;
import com.itheima11.gyl.domain.business.xsgl.Xsfhdzhub;

public interface XsfhdService extends BaseBusinessService<Xsfhdzhub, Xsfhdzhib>{
	public void saveXsfhd(Xsfhdzhub xsfhdzhub,List<Xsfhdzhib> xsfhdzhibs);
}
