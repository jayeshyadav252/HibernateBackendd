package com.niit.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.UserDAO;
import com.niit.model.User;


@Transactional
@Repository(value="userDAO")
public class DAOImpl implements UserDAO 
{
	@Autowired
	SessionFactory sessionFactory;

	public boolean addUser(User user) 
	{
		sessionFactory.getCurrentSession().save(user);
		return true;
	}

	public boolean updateUser(User user) {
		sessionFactory.getCurrentSession().update(user);
		return true;
	}

	public boolean deleteUser(int userid) {
		User u=new User();
		u.setUserid(userid);
		sessionFactory.getCurrentSession().delete(u);
		return true;
	}

	public List<User> displayUsers() {
		return sessionFactory.getCurrentSession().createQuery("from com.niit.model.User").getResultList();
		
	}
	

}
