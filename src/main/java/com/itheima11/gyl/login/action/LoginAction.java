package com.itheima11.gyl.login.action;

import java.util.Collection;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.itheima11.gyl.base.action.BaseAction;
import com.itheima11.gyl.domain.basedata.User;
import com.itheima11.gyl.domain.privilege.Privilege;
import com.itheima11.gyl.login.service.LoginService;
import com.itheima11.gyl.privilege.service.PrivilegeService;

@Controller("loginAction")
@Scope("prototype")
public class LoginAction extends BaseAction<User>{
	@Resource(name="loginService")
	private LoginService loginService;
	
	@Resource(name="privilegeService")
	private PrivilegeService privilegeService;
	
	public String authentication(){
		User user = this.loginService.
						authentication(this.getModel().getUsername(), this.getModel().getPassword());
		if(user==null){//用户名或者密码错误
			this.addActionError("用户名或者密码错误");
			return "login";
		}else{
			Collection<Privilege> functions = this.privilegeService.getFunctionTreeByUid(user.getUid());
			this.getSession().setAttribute("user", user);
			//把该用户能够访问到的功能权限放入到session中
			this.getSession().setAttribute("functions", functions);
			return "index";
		}
	}
}
