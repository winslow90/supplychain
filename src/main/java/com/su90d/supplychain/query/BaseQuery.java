/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.query;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author superman90
 */
public abstract class BaseQuery {
    /**
        * 当前页码，初始化的值为1
        */
       private int currentPage = 1;

       /**
        * 一页显示的条数
        */
       private int pageSize = 2;


       public int getCurrentPage() {
               return currentPage;
       }
       public void setCurrentPage(int currentPage) {
               this.currentPage = currentPage;
       }
       public int getPageSize() {
               return pageSize;
       }
       public void setPageSize(int pageSize) {
               this.pageSize = pageSize;
       }
       /**
        * 把页面上表单中的表单元素封装成map了
        */
       private Map<String, Object> keyValues = new HashMap<String, Object>();

       public Map<String, Object> getKeyValues() {
               return keyValues;
       }
       public void setKeyValues(Map<String, Object> keyValues) {
               this.keyValues = keyValues;
       }
       /**
        * 把页面上的查询条件封装成一个Map<String,Object>
        * 并且返回
        * @return
        */
       public abstract Map<String, Object> buildWhere();
    
}
