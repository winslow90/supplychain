package com.su90.gyl.dao.base;

import java.util.List;

import com.su90.gyl.query.BaseQuery;
import com.su90.gyl.query.PageResult;
public interface BaseDao<T>{
	
	void save(T t);
	void update(T t);
	void delete(java.io.Serializable id);
	T get(java.io.Serializable id);
	/**
	 * @param hql 完整的hql语句. SELECT obj FROM User obj WHERE obj.name like ?
	 * @param params 查询参数 new Object[]{"%itcast_%"}
	 * @param start 查询起始行
	 * @param limit 查询返回最大条数
	 * @return
	 */
	List query(String hql,Object[] params,int start,int limit);
	List query(String hql,Object[] params);

	/**
	 * @param condition 查询条件 ,注意不要在前面加and  如：obj.name = ? and obj.password=?
	 * @param params 查询条件参数 new Object[]{"admin","123456"}
	 * @param start 查询起始行
	 * @param limit 查询返回最大条数
	 * @return
	 */
	List<T> queryEntity(String condition,Object[] params,int start,int limit);
	
	List<T> queryEntity(String condition,Object[] params);
	
	<E> E uniqueResult(String hql,Object[] params);
	
	public PageResult<T> findPageResult(Class<T> entityClass, final BaseQuery baseQuery);
}
