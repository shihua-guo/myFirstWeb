package com.briup.web.action;

import com.briup.exception.UserServiceException;
import com.briup.pojo.User;
import com.briup.service.IUserService;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	
	//Service对象
	private IUserService service;
	//User对象
	private User user;
	
	/**
	 * 注册功能action
	 * @return
	 * @throws Exception
	 */
	public String register(){
		System.out.println("action："+this);
		try {
			service.register(user);
		} catch (UserServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}
	
	/**
	 * 登陆功能action
	 * @return
	 */
	public String login(){
		return SUCCESS;
		
	}
	public IUserService getService() {
		return service;
	}
	public void setService(IUserService service) {
		this.service = service;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}
