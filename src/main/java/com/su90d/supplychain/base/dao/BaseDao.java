/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.base.dao;

import com.su90d.supplychain.query.BaseQuery;
import com.su90d.supplychain.query.PageResult;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

/**
 *
 * @author superman90
 */
public interface BaseDao <T> {
    
    /**
    * 分页的查询
    * @param baseQuery
    * @return
    */
   public PageResult<T> findPageResult(final BaseQuery baseQuery);
   /**
    * 不分页的查询
    * @return
    */
   public Collection<T> findEntry();

   /**
    * 保存
    * @param t
    */
   public void saveEntry(T t);

   /**
    * 修改
    * @param t
    */
   public void updateEntry(T t);

   /**
    * 根据ids删除一些数据
    * @param ids
    */
   public void deleteEntriesByIDS(Serializable[] ids);

   /**
    * 根据id删除一条数据
    * @param id
    */
   public void deleteEntry(Serializable id);

   /**
    * 根据id提取一条数据
    */
   public T getEntryById(Serializable id);

   /**
    * 根据ids提取很多条数据
    */
   public Set<T> getEntriesByIds(Serializable[] ids);

   /**
    * 查询某一张表的总的记录数
    */
   public int getCount(final BaseQuery baseQuery);
    
}
