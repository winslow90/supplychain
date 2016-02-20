package com.su90.gyl.xsydd.service.impl;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.su90.gyl.domain.xsgl.Xsyddzhub;
import com.su90.gyl.query.BaseQuery;
import com.su90.gyl.query.PageResult;
import com.su90.gyl.xsydd.dao.XsyddDao;
import com.su90.gyl.xsydd.service.XsyddService;

@Service("xsyddService")
public class XsyddServiceImpl implements XsyddService{
	@Resource(name="xsyddDao")
	private XsyddDao xsyddDao;

	@Override
	public PageResult<Xsyddzhub> getAllXsyddzhub(BaseQuery baseQuery) {
		// TODO Auto-generated method stub
		return this.xsyddDao.findPageResult(Xsyddzhub.class, baseQuery);
	}
}
