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
public class DepartmentQuery extends BaseQuery{
	private String name;
	private String description;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public Map<String, Object> buildWhere() {
		if(StringUtils.isNotBlank(this.name)){//name属性的值不为空
			this.getKeyValues().put("name", this.name);
		}
		if(StringUtils.isNotBlank(this.description)){//description属性的值不为空
			this.getKeyValues().put("description", this.description);
		}
		return this.getKeyValues();
	}
	
}