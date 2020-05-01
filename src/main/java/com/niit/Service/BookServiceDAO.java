package com.niit.Service;

import java.util.List;

import com.niit.model.Book;

public interface BookServiceDAO 
{
	public boolean addBook(Book book);
	public boolean updateBook(Book book);
	public boolean deleteBook(int bookid);
	public List<Book> displayBooks();

}
