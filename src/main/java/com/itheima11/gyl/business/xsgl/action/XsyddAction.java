package com.itheima11.gyl.business.xsgl.action;

import java.util.HashSet;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima11.gyl.business.xsgl.service.XsyddService;
import com.itheima11.gyl.domain.business.xsgl.Xsyddzhib;
import com.itheima11.gyl.domain.business.xsgl.Xsyddzhub;
import com.itheima11.gyl.query.PageResult;
import com.itheima11.gyl.query.business.xsgl.XsyddzhibQuery;
import com.itheima11.gyl.query.business.xsgl.XsyddzhubQuery;
import com.opensymphony.xwork2.ActionContext;

@Controller("xsyddAction")
@Scope("prototype")
public class XsyddAction{
	/**
	 * 主表的查询条件
	 */
	private XsyddzhubQuery query_zhub = new XsyddzhubQuery();
	
	/**
	 * 子表的查询条件
	 */
	private XsyddzhibQuery query_zhib = new XsyddzhibQuery();
	
	/**
	 * 在增加的时候，接受页面上子表的表格中的值
	 */
	private List<Xsyddzhib> xsyddzhibs;
	

	public List<Xsyddzhib> getXsyddzhibs() {
		return xsyddzhibs;
	}
	public void setXsyddzhibs(List<Xsyddzhib> xsyddzhibs) {
		this.xsyddzhibs = xsyddzhibs;
	}
	public XsyddzhubQuery getQuery_zhub() {
		return query_zhub;
	}
	public void setQuery_zhub(XsyddzhubQuery query_zhub) {
		this.query_zhub = query_zhub;
	}
	public XsyddzhibQuery getQuery_zhib() {
		return query_zhib;
	}
	public void setQuery_zhib(XsyddzhibQuery query_zhib) {
		this.query_zhib = query_zhib;
	}
	@Resource(name="xsyddService")
	private XsyddService xsyddService;
	/**
	 * 查询销售预订单
	 * @return
	 */
	public String showXsydd(){
		PageResult<Xsyddzhub> pageResult_zhu = this.xsyddService.getEntrties_zhu(query_zhub);
		PageResult<Xsyddzhib> pageResult_zhi = this.xsyddService.getEntrties_zi(query_zhib);
		
		ActionContext.getContext().put("pageResult_zhub", pageResult_zhu);
		ActionContext.getContext().put("pageResult_zhib", pageResult_zhi);
		
		return "xsyddList";
	}
	
	/**
	 * 跳转到添加页面
	 */
	public String addUI(){
		return "xsyddAddUI";
	}
	
	/**
	 * 增加
	 */
	public String add(){
		Xsyddzhub xsyddzhub = new Xsyddzhub();
		BeanUtils.copyProperties(this.query_zhub, xsyddzhub);
		//建立销售预订单主表和子表的关系
		xsyddzhub.setXsyddzhibs(new HashSet<Xsyddzhib>(this.xsyddzhibs));
		//设置销售预订单的最新的订单号
		xsyddzhub.setDdh(this.xsyddService.getMax());
		this.xsyddService.saveEntry_zhu(xsyddzhub);
		return "chain";
	}
}
