package com.niit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.Service.BookServiceDAO;
import com.niit.config.AppConfig;
import com.niit.model.Book;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppConfig.class)
public class BookTest 
{
	Book b = new Book();
	
	@Autowired
	BookServiceDAO bookServiceDAO;
	
	
	@Test
	//@Ignore
	public void addBook()
	{
	
		b.setBookname("harry potter");
		b.setBookprice(874);
		b.setBookquantity(4);
		assertEquals(true, bookServiceDAO.addBook(b));
	}
	
	@Test
	@Ignore
	public void updateBook()
	{
		b.setBookid(1);
		b.setBookname("HATE");
		assertEquals(true, bookServiceDAO.updateBook(b));
	}
	
	@Test
	@Ignore
	public void deleteBook()
	{
		assertEquals(true, bookServiceDAO.deleteBook(1));
	}
	
	@Test
	public void displayBooks()
	{
		assertEquals(true, bookServiceDAO.displayBooks());
	}
	
	

}
