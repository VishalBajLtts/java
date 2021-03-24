package com.ltts.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ltts.model.Book;

@Repository
public class BookDao {
	
	public List<Book>  getAllBooks()
	{
		List<Book> li=new ArrayList<Book>();
		li.add(new Book(101,"Mahabharata","Sanskrit"));
		li.add(new Book(102,"Bibal","English"));
		li.add(new Book(103,"Quran","Arabic"));
		return li;
		
	}
	
	

}
