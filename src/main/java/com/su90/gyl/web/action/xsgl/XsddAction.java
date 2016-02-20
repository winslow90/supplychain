package com.su90.gyl.web.action.xsgl;

import com.su90.gyl.domain.xsgl.Xsddzhub;
import com.su90.gyl.web.action.base.BaseAction;

import com.opensymphony.xwork2.ActionSupport;

public class XsddAction extends BaseAction<Xsddzhub>{
	public String showAllXsddzhub(){
		return "list";
	}
}
