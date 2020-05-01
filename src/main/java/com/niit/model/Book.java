package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="books")
public class Book 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int bookid;
	@Column
	String bookname;
	Double bookprice;
	int bookquantity;
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public Double getBookprice() {
		return bookprice;
	}
	public void setBookprice(double i) {
		this.bookprice = i;
	}
	public int getBookquantity() {
		return bookquantity;
	}
	public void setBookquantity(int bookquantity) {
		this.bookquantity = bookquantity;
	}
	
	
}
