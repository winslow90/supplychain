package com.itheima11.gyl.privilege.action;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima11.gyl.base.action.BaseAction;
import com.itheima11.gyl.domain.privilege.Menuitem;
import com.itheima11.gyl.privilege.service.MenuitemService;
import com.opensymphony.xwork2.ActionContext;

@Controller("menuitemAction")
@Scope("prototype")
public class MenuitemAction extends BaseAction<Menuitem>{
	@Resource(name="menuitemService")
	private MenuitemService menuitemService;
	
	public String showMenuitemTree(){
		Collection<Menuitem> menuitems = this.menuitemService.getEntries();
		ActionContext.getContext().getValueStack().push(menuitems);
		return SUCCESS;
	}
}
