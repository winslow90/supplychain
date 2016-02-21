package com.itheima11.gyl.business.xsgl.service;

import java.util.List;

import com.itheima11.gyl.business.base.service.BaseBusinessService;
import com.itheima11.gyl.domain.business.xsgl.Xsyddzhib;
import com.itheima11.gyl.domain.business.xsgl.Xsyddzhub;
import com.itheima11.gyl.domain.business.xsgl.Xsysdzhib;
import com.itheima11.gyl.domain.business.xsgl.Xsysdzhub;

public interface XsysdService extends BaseBusinessService<Xsysdzhub, Xsysdzhib>{
	public void saveXsysd(Xsysdzhub xsysdzhub,List<Xsysdzhib> xsysdzhibs);
}
