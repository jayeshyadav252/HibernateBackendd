package com.niit.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.DAO.BookDAO;
import com.niit.Service.BookServiceDAO;
import com.niit.model.Book;

@Service
public class BookServiceImpl implements BookServiceDAO
{
	@Autowired
	BookDAO bookDAO;

	public boolean addBook(Book book) {
		bookDAO.addBook(book);
		return true;
	}

	public boolean updateBook(Book book) {
		bookDAO.updateBook(book);
		return true;
	}

	public boolean deleteBook(int bookid) {
		bookDAO.deleteBook(bookid);
		return true;
		
	}

	public List<Book> displayBooks() {
		return bookDAO.displayBooks();
	}
	

}
