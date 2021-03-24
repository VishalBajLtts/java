package com.ltts.model;

public class Book {
	int bookId;
	String bookName;
	String bookLang;
	
	
	
	public Book() {
		super();
	}
	
	
	public Book(int bookId, String bookName, String bookLang) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookLang = bookLang;
	}


	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookLang() {
		return bookLang;
	}
	public void setBookLang(String bookLang) {
		this.bookLang = bookLang;
	}

}
