package com.bookService.service;

import java.util.ArrayList;

import com.bookService.dao.BookDAO;
import com.bookService.vo.BookVO;

public class BookService {
	private static BookService service = new BookService();
	public BookDAO dao = BookDAO.getInstance();
	
	private BookService() {	}
	public static BookService getInstance() {
		return service;
	}
	
	public boolean bookInsert(BookVO book) {
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
	
	public ArrayList<BookVO> bookList(){
		ArrayList<BookVO> list = dao.bookList();
		return list;
	}
	
	public void bookReturn(int ID) {
		dao.bookReturn(ID);
	}
	
	public BookVO bookSearch(int ID) {
		return dao.bookSearch(ID);
	}
}
