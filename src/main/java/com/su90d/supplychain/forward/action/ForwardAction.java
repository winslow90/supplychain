/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.su90d.supplychain.forward.action;

import com.opensymphony.xwork2.ActionSupport;

/**
 *
 * @author superman90
 */
public class ForwardAction extends ActionSupport{
	
	private String method;

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}
	
	public String forward(){
		return this.method;
	}
}
