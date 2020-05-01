package com.niit.DAO;

import java.util.List;

import com.niit.model.Book;

public interface BookDAO 
{
	public boolean addBook(Book book);
	public boolean updateBook(Book book);
	public boolean deleteBook(int bookid);
	public List<Book> displayBooks();

}
