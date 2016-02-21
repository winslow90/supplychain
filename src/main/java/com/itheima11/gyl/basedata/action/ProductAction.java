package com.itheima11.gyl.basedata.action;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima11.gyl.base.action.BaseAction;
import com.itheima11.gyl.basedata.service.ProductService;
import com.itheima11.gyl.domain.basedata.Product;
import com.opensymphony.xwork2.ActionContext;

@Controller("productAction")
@Scope("prototype")
public class ProductAction extends BaseAction<Product>{
	@Resource(name="productService")
	private ProductService productService;
	
	public String showProduct(){
		Collection<Product> products = this.productService.getEntries();
		ActionContext.getContext().getValueStack().push(products);
		return SUCCESS;
	}
}	
