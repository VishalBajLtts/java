package com.ltts.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.dao.BookDao;
import com.ltts.model.Book;

@RestController
public class BookController {
	
	@Autowired
	BookDao bd;
	
	@GetMapping("/books")
	public List<Book> getBook()
	{
		return bd.getAllBooks();
		
	}
	
	
	@RequestMapping("/")
	public String home(){
		return "Helllooo welcome to library";
		
		
	}

}
