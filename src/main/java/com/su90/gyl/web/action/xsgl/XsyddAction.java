package com.su90.gyl.web.action.xsgl;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.config.entities.ActionConfig;

import com.su90.gyl.domain.xsgl.Xsyddzhub;
import com.su90.gyl.query.BaseQuery;
import com.su90.gyl.query.PageResult;
import com.su90.gyl.query.XsyddQuery;
import com.su90.gyl.web.action.base.BaseAction;
import com.su90.gyl.xsydd.service.XsyddService;

/**
 * 销售预订单action
 * @author zd
 *
 */
@Controller("xsyddAction")
@Scope("prototype")
public class XsyddAction extends BaseAction<Xsyddzhub>{
	@Resource(name="xsyddService")
	private XsyddService xsyddService;
	
	private XsyddQuery baseQuery = new XsyddQuery();
	
	public void setBaseQuery(XsyddQuery baseQuery){
		this.baseQuery = baseQuery;
	}
	
	public XsyddQuery getBaseQuery(){
		return this.baseQuery;
	}
	
	public String showAllXsydd(){
		PageResult<Xsyddzhub> pageResult = this.xsyddService.getAllXsyddzhub(baseQuery);
		ActionContext.getContext().put("pageResult", pageResult);
		return "xsyddList";
	}
	
	public String updateUI(){
		return "xsyddUpdateUI";
	}
}
