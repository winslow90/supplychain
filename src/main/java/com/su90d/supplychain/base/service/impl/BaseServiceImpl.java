/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.base.service.impl;

import com.su90d.supplychain.base.dao.BaseDao;
import com.su90d.supplychain.base.service.BaseService;
import com.su90d.supplychain.query.BaseQuery;
import com.su90d.supplychain.query.PageResult;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

/**
 *
 * @author superman90
 */
public abstract class BaseServiceImpl<T> implements BaseService<T> {
    
    public abstract BaseDao getBaseDao();

    @Override
    public PageResult<T> getPageResult(BaseQuery baseQuery) {
        return this.getBaseDao().findPageResult(baseQuery);
    }

    @Override
    public Collection<T> getEntries() {
        return this.getBaseDao().findEntry();
    }

    @Override
    public Set<T> getEntriesByIds(Serializable[] ids) {
        return this.getBaseDao().getEntriesByIds(ids);
    }

    @Override
    public void saveEntry(T t) {
        this.getBaseDao().saveEntry(t);
    }

    @Override
    public void updateEntry(T t) {
        this.getBaseDao().updateEntry(t);
    }

    @Override
    public T getEntryById(Serializable id) {
        return (T) this.getBaseDao().getEntryById(id);
    }

    @Override
    public void deleteEntriesByIds(Serializable[] ids) {
        this.getBaseDao().deleteEntriesByIDS(ids);
    }

    @Override
    public void deleteEntryById(Serializable id) {
        this.getBaseDao().deleteEntry(id);
    }
    
}
