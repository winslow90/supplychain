package com.itheima11.gyl.business.xsgl.service;

import java.util.List;

import com.itheima11.gyl.business.base.service.BaseBusinessService;
import com.itheima11.gyl.domain.business.xsgl.Xsckdzhib;
import com.itheima11.gyl.domain.business.xsgl.Xsckdzhub;

public interface XsckdService extends BaseBusinessService<Xsckdzhub, Xsckdzhib>{
	public void saveXsckd(Xsckdzhub xsckdzhub,List<Xsckdzhib> xsckdzhibs);
}
