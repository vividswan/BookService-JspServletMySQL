package com.bookService.service;

import com.bookService.bean.BookBean;
import com.bookService.dao.BookDAO;

public class BookService {
	private static BookService service = new BookService();
	public BookDAO dao = BookDAO.getInstance();
	
	private BookService() {	}
	public static BookService getInstance() {
		return service;
	}
	
	public void bookInsert(BookBean book) {
		dao.bookInsert(book);
	}
}
