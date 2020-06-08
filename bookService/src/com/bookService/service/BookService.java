package com.bookService.service;

import java.util.ArrayList;

import com.bookService.bean.BookBean;
import com.bookService.dao.BookDAO;

public class BookService {
	private static BookService service = new BookService();
	public BookDAO dao = BookDAO.getInstance();
	
	private BookService() {	}
	public static BookService getInstance() {
		return service;
	}
	
	public boolean bookInsert(BookBean book) {
		if(dao.duplicatationCheck(book)) {
			return false;
		}else {
		dao.bookInsert(book);
		return true;
		}
	}
	public boolean bookBorrow(int ID) {
		return dao.bookUpdate(ID);
	}
	
	public ArrayList<BookBean> bookList(){
		ArrayList<BookBean> list = dao.bookList();
		return list;
	}
	
	public void bookReturn(int ID) {
		dao.bookReturn(ID);
	}
}
