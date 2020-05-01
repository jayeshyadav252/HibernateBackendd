package com.niit.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.niit.DAO.BookDAO;
import com.niit.model.Book;
import com.sun.xml.bind.v2.runtime.Name;

@Transactional
@Repository(value="bookDAO")
public class BookDAOImpl implements BookDAO
{
	@Autowired
	SessionFactory sessionFactory;

	public boolean addBook(Book book) {
		sessionFactory.getCurrentSession().save(book);
		return true;
	}

	public boolean updateBook(Book book) {
		sessionFactory.getCurrentSession().update(book);
		return true;
	}

	public boolean deleteBook(int bookid) {
		Book b= new Book();
		b.setBookid(bookid);
		sessionFactory.getCurrentSession().delete(b);
		return true;
	}

	public List<Book> displayBooks() {
		return sessionFactory.getCurrentSession().createQuery("from com.niit.model.Book").getResultList();
		
	}
	

}
