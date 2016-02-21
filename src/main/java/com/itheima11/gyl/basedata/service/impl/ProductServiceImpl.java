package com.itheima11.gyl.basedata.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.itheima11.gyl.base.dao.BaseDao;
import com.itheima11.gyl.base.service.impl.BaseServiceImpl;
import com.itheima11.gyl.basedata.dao.ProductDao;
import com.itheima11.gyl.basedata.service.ProductService;
import com.itheima11.gyl.domain.basedata.Product;
@Service("productService")
public class ProductServiceImpl extends BaseServiceImpl<Product> implements ProductService{
	@Resource(name="productDao")
	private ProductDao productDao;
	@Override
	public BaseDao getBaseDao() {
		// TODO Auto-generated method stub
		return this.productDao;
	}

}
