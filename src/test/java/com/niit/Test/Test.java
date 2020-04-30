package com.niit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;


import com.niit.Service.ServiceDAO;

import com.niit.config.AppConfig;
import com.niit.model.User;



@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppConfig.class)
public class Test
{
	@Autowired
	ServiceDAO dao;
	
	User u= new User();
	
	@org.junit.Test
	@Ignore
	public void addUser()
	{
		
		u.setUsername("hgdskhdg");
		u.setEmail("jdsfdsnkcns");
		u.setPassword("hscksh");
		assertEquals(true,dao.addUser(u));
	}
	
	@org.junit.Test
	@Ignore
	public void deleteUser()
	{
		
		assertEquals(true,dao.deleteUser(2));
		
	}
	
	@org.junit.Test
	@Ignore
	public void updateUser()
	{
		u.setUserid(2);
		u.setEmail("jayeshh");
		assertEquals(true, dao.updateUser(u));
		
	}
	
	
	@org.junit.Test
	public void displayUser()
{
		assertEquals(true, dao.displayUsers());
}
	
	
	
	
	

}
