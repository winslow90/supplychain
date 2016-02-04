/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.query.basedata;

import com.su90d.supplychain.query.BaseQuery;
import java.util.Map;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author superman90
 */
public class UserQuery extends BaseQuery {
    private String username;
    private String email;

    @Override
    public Map<String, Object> buildWhere() {
            if(StringUtils.isNotBlank(this.username)){
                    this.getKeyValues().put("username", this.username);
            }
            if(StringUtils.isNotBlank(this.email)){
                    this.getKeyValues().put("email", this.email);
            }
            return this.getKeyValues();
    }
    
}
