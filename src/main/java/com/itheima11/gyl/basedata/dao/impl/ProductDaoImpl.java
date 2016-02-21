package com.itheima11.gyl.basedata.dao.impl;

import org.springframework.stereotype.Repository;

import com.itheima11.gyl.base.dao.impl.BaseDaoImpl;
import com.itheima11.gyl.basedata.dao.ProductDao;
import com.itheima11.gyl.domain.basedata.Product;

@Repository("productDao")
public class ProductDaoImpl extends BaseDaoImpl<Product> implements ProductDao{

}
