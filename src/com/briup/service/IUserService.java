package com.briup.service;

import com.briup.exception.UserServiceException;
import com.briup.pojo.User;

public interface IUserService {
	/**
	 * 注册功能：传入user对象，调用dao层方法存入新用户到DB
	 * @param user
	 * @throws UserServiceException
	 */
	void register(User user) throws UserServiceException;
	
	/**
	 * 登陆功能：传入用户名和密码，调用dao层方法
	 * @param username
	 * @param password
	 * @return
	 * @throws UserServiceException
	 */
	User login(String username,String password) throws UserServiceException;
}
