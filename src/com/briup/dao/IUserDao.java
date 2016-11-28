package com.briup.dao;

import com.briup.exception.UserDaoException;
import com.briup.pojo.User;

public interface IUserDao {
	/**
	 * 插入新用户
	 * @param user
	 * @throws UserDaoException
	 */
	void save(User user) throws UserDaoException;
	
	/**
	 * 通过用户名查询用户信息
	 * @param name
	 * @throws UserDaoException
	 */
	void findUserByName(String name) throws UserDaoException;
}
