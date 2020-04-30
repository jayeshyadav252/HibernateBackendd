package com.niit.DAO;

import java.util.List;

import com.niit.model.User;

public interface UserDAO
{
	public boolean addUser(User user);
	public boolean updateUser(User user);
	public boolean deleteUser(int userid);
	public List<User> displayUsers();
}
