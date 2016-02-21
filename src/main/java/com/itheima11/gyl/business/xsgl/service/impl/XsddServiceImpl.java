package com.itheima11.gyl.business.xsgl.service.impl;

import java.beans.PropertyDescriptor;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.itheima11.gyl.base.dao.BaseDao;
import com.itheima11.gyl.business.base.service.impl.BaseBusinessServiceImpl;
import com.itheima11.gyl.business.xsgl.dao.XsddzhibDao;
import com.itheima11.gyl.business.xsgl.dao.XsddzhubDao;
import com.itheima11.gyl.business.xsgl.service.XsddService;
import com.itheima11.gyl.domain.business.xsgl.Xsddzhib;
import com.itheima11.gyl.domain.business.xsgl.Xsddzhub;
import com.itheima11.gyl.utils.GylConstantKey;

@Service("xsddService")
public class XsddServiceImpl extends BaseBusinessServiceImpl<Xsddzhub, Xsddzhib> implements XsddService{
	@Resource(name="xsddzhubDao")
	private XsddzhubDao xsddzhubDao;
	@Resource(name="xsddzhibDao")
	private XsddzhibDao xsddzhibDao;
	@Override
	public BaseDao<Xsddzhub> getBaseDao_zhu() {
		// TODO Auto-generated method stub
		return this.xsddzhubDao;
	}
	@Override
	public BaseDao<Xsddzhib> getBaseDao_zhi() {
		// TODO Auto-generated method stub
		return this.xsddzhibDao;
	}
	@Override
	public Object getXsddByDDH(String ddh) {
		Xsddzhub xsddzhub = this.xsddzhubDao.getXsddzhubByDDH(ddh);
		String state = xsddzhub.getState();
		if(GylConstantKey.XSDDZHUB_STATE_CLOSE.equals(state)){//该销售订单已经完成了
			return "1";
		}else{
			return xsddzhub;
		}
	}
	@Transactional
	public void updateXsdd(String item, String textValue,String ddh,Long hh) throws Exception{
		String type = item.split("_")[1];
		String filedKey = item.split("_")[0];//filedKey的值"spmc"
		if("zhu".equals(type)){//要修改的是主表
			Xsddzhub xsddzhub = this.xsddzhubDao.getXsddzhubByDDH(ddh);
			PropertyDescriptor propertyDescriptor = new PropertyDescriptor(filedKey, xsddzhub.getClass());
			propertyDescriptor.getWriteMethod().invoke(xsddzhub, textValue);
		}else if("zhi".equals(type)){//要修改的是子表
			Xsddzhib xsddzhib = this.xsddzhibDao.getXsddzhibByCondition(ddh, hh);
			PropertyDescriptor propertyDescriptor = new PropertyDescriptor(filedKey, xsddzhib.getClass());
			propertyDescriptor.getWriteMethod().invoke(xsddzhib, textValue);
		}
	}
}
