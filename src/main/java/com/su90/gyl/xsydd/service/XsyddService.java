package com.su90.gyl.xsydd.service;

import com.su90.gyl.domain.xsgl.Xsyddzhub;
import com.su90.gyl.query.BaseQuery;
import com.su90.gyl.query.PageResult;

public interface XsyddService {
	public PageResult<Xsyddzhub> getAllXsyddzhub(BaseQuery baseQuery);
}
