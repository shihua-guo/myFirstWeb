package com.briup.service.impl;

import com.briup.dao.IUserDao;
import com.briup.exception.UserDaoException;
import com.briup.exception.UserServiceException;
import com.briup.pojo.User;
import com.briup.service.IUserService;

public class UserServiceImpl implements IUserService{
	private IUserDao dao;
	
	@Override
	public void register(User user) throws UserServiceException {
		try {
			dao.save(user);
//			throw new UserServiceException("测试是否添加了事务");
		} catch (UserDaoException e) {
			//往上抛出异常
			throw new UserServiceException(e.getMessage());
		}
	}

	@Override
	public User login(String username, String password) throws UserServiceException {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public IUserDao getDao() {
		return dao;
	}

	public void setDao(IUserDao dao) {
		this.dao = dao;
	}

}
