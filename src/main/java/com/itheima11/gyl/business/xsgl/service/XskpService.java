package com.itheima11.gyl.business.xsgl.service;

import java.util.List;

import com.itheima11.gyl.business.base.service.BaseBusinessService;
import com.itheima11.gyl.domain.business.xsgl.Xskpzhib;
import com.itheima11.gyl.domain.business.xsgl.Xskpzhub;

public interface XskpService extends BaseBusinessService<Xskpzhub, Xskpzhib>{
	public void saveXskp(Xskpzhub xskpzhub,List<Xskpzhib> xskpzhibs);
}
