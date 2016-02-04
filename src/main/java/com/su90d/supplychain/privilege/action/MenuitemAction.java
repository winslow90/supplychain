/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.privilege.action;

import com.opensymphony.xwork2.ActionContext;
import com.su90d.supplychain.base.action.BaseAction;
import com.su90d.supplychain.domain.privilege.Menuitem;
import com.su90d.supplychain.privilege.service.MenuitemService;
import java.util.Collection;
import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 *
 * @author superman90
 */
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
