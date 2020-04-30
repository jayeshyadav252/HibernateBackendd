package com.niit.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.DAO.UserDAO;

import com.niit.Service.ServiceDAO;
import com.niit.model.User;


@Service
public class ServiceImpl implements ServiceDAO
{
	@Autowired
	UserDAO userDAO;
	
	public boolean addUser(User user) {
		
		userDAO.addUser(user);
		return true;
	}

	public boolean updateUser(User user) {
		userDAO.updateUser(user);
		return true;
		}

	public boolean deleteUser(int userid) {
		userDAO.deleteUser(userid);
		return true;
	}

	public List<User> displayUsers() {
		return userDAO.displayUsers();
	}
	

}
