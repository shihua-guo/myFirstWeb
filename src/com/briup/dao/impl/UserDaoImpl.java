package com.briup.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;

import com.briup.dao.IUserDao;
import com.briup.exception.UserDaoException;
import com.briup.pojo.User;

public class UserDaoImpl implements IUserDao{
	private HibernateTemplate  hibernateTemplate;
	public void setSessionFactory(SessionFactory sessionFactory){
		this.hibernateTemplate = new HibernateTemplate(sessionFactory);
	}
	@Override
	public void save(User user) throws UserDaoException {
		hibernateTemplate.save(user);
	}

	@Override
	public void findUserByName(String name) throws UserDaoException {
		// TODO Auto-generated method stub
		
	}

}
