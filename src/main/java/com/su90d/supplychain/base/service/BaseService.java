/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.base.service;

import com.su90d.supplychain.query.BaseQuery;
import com.su90d.supplychain.query.PageResult;
import java.io.Serializable;
import java.util.Collection;
import java.util.Set;

/**
 *
 * @author superman90
 */
public interface BaseService <T> {
    public PageResult<T> getPageResult(final BaseQuery baseQuery);
    public Collection<T> getEntries();
    public Set<T> getEntriesByIds(Serializable[] ids);
    public void saveEntry(T t);
    public void updateEntry(T t);
    public T getEntryById(Serializable id);
    public void deleteEntriesByIds(Serializable[] ids);
    public void deleteEntryById(Serializable id);    
}
