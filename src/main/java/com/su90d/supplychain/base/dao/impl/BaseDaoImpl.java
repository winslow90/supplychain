/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.base.dao.impl;

import com.su90d.supplychain.base.dao.BaseDao;
import com.su90d.supplychain.query.BaseQuery;
import com.su90d.supplychain.query.PageResult;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.metadata.ClassMetadata;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.HibernateTemplate;
/**
 *
 * @author superman90
 */
public class BaseDaoImpl <T> implements BaseDao <T>  {
    
    private final Class classt;
    private ClassMetadata classMetaData;
        
    public BaseDaoImpl(){
        ParameterizedType parameterizedType = (ParameterizedType) this.getClass().getGenericSuperclass();
        classt = (Class) parameterizedType.getActualTypeArguments()[0];
    }
    
    @PostConstruct
    public void init(){
        this.classMetaData= this.hibernateTemplate.getSessionFactory().getClassMetadata(classt);
    }
    
    @Resource(name="hibernateTemplate")
    protected HibernateTemplate hibernateTemplate;

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Override
    public PageResult<T> findPageResult(final BaseQuery baseQuery) {
        //返回根据查询条件查询的总的记录数
        int totleRows = this.getCount(baseQuery);
        //创建PageResult对象
        final PageResult<T> pageResult = new PageResult<T>(baseQuery.getCurrentPage(),baseQuery.getPageSize(),totleRows);
        /**
         * 拼接where条件语句
         */
        final StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("from "+this.classt.getSimpleName());
        stringBuffer.append(" where 1=1 ");
        //在map中封装的查询条件
        final Map<String, Object> keyValues = baseQuery.buildWhere();
        for (Entry<String, Object> entry : keyValues.entrySet()) {//把查询条件放到where的后面
                stringBuffer.append(" and "+entry.getKey()+"=:"+entry.getKey());
        }

        return this.hibernateTemplate.execute(new HibernateCallback<PageResult<T>>() {

                @Override
                public PageResult<T> doInHibernate(Session session) throws HibernateException,
                                SQLException {
                        //根据拼接的hql语句产生一个query对象
                        Query query = session.createQuery(stringBuffer.toString());
                        /**
                         * 给hql语句的参数赋值
                         */
                        for (Entry<String, Object> entry : keyValues.entrySet()) {
                                query.setParameter(entry.getKey(), entry.getValue());
                        }
                        //设置当前页的第一行在集合中的位置
                        int firstResult = (baseQuery.getCurrentPage()-1)*baseQuery.getPageSize();
                        //设置每页显示的做多的行数
                        int maxResult = baseQuery.getPageSize();
                        //用hibernate的方式设置分页
                        query.setFirstResult(firstResult).setMaxResults(maxResult);
                        //返回分页后的结果集
                        List<T> rows = query.list();
                        //把结果设置到pageResult
                        pageResult.setRows(rows);
                        return pageResult;
                }
        });
    }

    @Override
    public Collection<T> findEntry() {
        return this.hibernateTemplate.find("from "+this.classt.getSimpleName());
    }

    @Override
    public void saveEntry(T t) {
        this.hibernateTemplate.save(t);
    }

    @Override
    public void updateEntry(T t) {
        this.hibernateTemplate.update(t);
    }

    @Override
    public void deleteEntriesByIDS(Serializable[] ids) {
        /**
        * [1,2,3,4]-->"1,2,3,4"
        */
       StringBuffer stringBuffer = new StringBuffer();
       for (int i = 0; i < ids.length; i++) {
               if(i==ids.length-1){
                       stringBuffer.append(ids[i]);
               }else{
                       stringBuffer.append(ids[i]).append(",");
               }
       }
       StringBuffer hql = new StringBuffer();
       /**
        * this.classt.getSimpleName()是持久化类的名称
        */
       hql.append("from ").append(this.classt.getSimpleName());
       /**
        * this.classMetadata.getIdentifierPropertyName()持久化类id的名称
        */
       hql.append(" where "+this.classMetaData.getIdentifierPropertyName());
       hql.append(" in(");
       hql.append(stringBuffer.toString());
       hql.append(")");
       List<T> list = this.hibernateTemplate.find(hql.toString());
       this.hibernateTemplate.deleteAll(list);
    }

    @Override
    public void deleteEntry(Serializable id) {
        T t = (T)this.hibernateTemplate.get(this.classt, id);
        this.hibernateTemplate.delete(t);
    }

    @Override
    public T getEntryById(Serializable id) {
        return (T)this.hibernateTemplate.get(this.classt, id);
    }

    @Override
    public Set<T> getEntriesByIds(Serializable[] ids) {
        /**
        * [1,2,3,4]-->"1,2,3,4"
        */
       StringBuffer stringBuffer = new StringBuffer();
       for (int i = 0; i < ids.length; i++) {
               if(i==ids.length-1){
                       stringBuffer.append(ids[i]);
               }else{
                       stringBuffer.append(ids[i]+",");
               }
       }
       StringBuffer hql = new StringBuffer();
       /**
        * this.classt.getSimpleName()是持久化类的名称
        */
       hql.append("from "+this.classt.getSimpleName());
       /**
        * this.classMetadata.getIdentifierPropertyName()持久化类id的名称
        */
       hql.append(" where "+this.classMetaData.getIdentifierPropertyName());
       hql.append(" in(");
       hql.append(stringBuffer.toString());
       hql.append(")");
       List<T> list = this.hibernateTemplate.find(hql.toString());
       return new HashSet<T>(list);//从list到set的转化
    }

    @Override
    public int getCount(BaseQuery baseQuery) {
        final BaseQuery thebaseQuery = baseQuery;
        return this.hibernateTemplate.execute(new HibernateCallback<Integer>() {
                @Override
                public Integer doInHibernate(Session session) throws HibernateException,
                                SQLException {
                        StringBuffer stringBuffer = new StringBuffer();
                        stringBuffer.append("select count("+classMetaData.getIdentifierPropertyName()+") from "+classt.getSimpleName());
                        stringBuffer.append(" where 1=1 ");

                        //获取所有的查询条件
                        Map<String, Object> keyValues = thebaseQuery.buildWhere();

                        /**
                         * 拼接where条件的过程
                         */
                        for (Entry<String, Object> entry : keyValues.entrySet()) {
                                stringBuffer.append("and "+entry.getKey()+"=:"+entry.getKey());
                        }

                        System.out.println("hql语句:"+stringBuffer.toString());

                        Query query = session.createQuery(stringBuffer.toString());//存放一个hql语句

                        /**
                         * 把where条件中的参数传递值的过程
                         */
                        for (Entry<String, Object> entry : keyValues.entrySet()) {
                                query.setParameter(entry.getKey(), entry.getValue());
                        }

                        Long count  = (Long)query.uniqueResult();
                        return count.intValue();
                }
        });
    }
    
}
