package com.itheima11.gyl.business.xsgl;

import org.junit.Test;

import com.itheima11.gyl.business.xsgl.dao.XsyddzhubDao;
import com.itheima11.gyl.business.xsgl.service.XsyddService;
import com.itheima11.gyl.domain.business.xsgl.Xsyddzhib;
import com.itheima11.gyl.query.PageResult;
import com.itheima11.gyl.query.business.xsgl.XsyddzhibQuery;
import com.itheima11.gyl.test.utils.SpringUtils;

public class XsyddTest extends SpringUtils{
	@Test
	public void testQuery(){
		XsyddService xsyddService = (XsyddService)context.getBean("xsyddService");
//		XsyddzhubQuery baseQuery = new XsyddzhubQuery();
//		baseQuery.setKhmc("asdf");
//		//baseQuery.setCurrentPage(2);
//		PageResult<Xsyddzhub> pageResult_zhu = xsyddService.getEntrties_zhu(baseQuery);
//		System.out.println(pageResult_zhu.getRows().size());
		
		XsyddzhibQuery xsyddzhibQuery = new XsyddzhibQuery();
		//xsyddzhibQuery.setXsyddzhubid(1L);
		xsyddzhibQuery.setCurrentPage(3);
		PageResult<Xsyddzhib> pageResult = xsyddService.getEntrties_zi(xsyddzhibQuery);
		System.out.println(pageResult.getRows().size());
	}
	
	@Test
	public void testMax(){
		XsyddzhubDao xsyddzhubDao = (XsyddzhubDao)context.getBean("xsyddzhubDao");
		System.out.println(xsyddzhubDao.getMax());
	}
}
