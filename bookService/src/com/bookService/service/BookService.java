package com.bookService.service;

import java.util.ArrayList;

import com.bookService.controller.BookListController;
import com.bookService.dao.BookDAO;
import com.bookService.vo.BookVO;

public class BookService {
	private static int upperSeqNo;
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
	
	public ArrayList<BookVO> bookList(int upperSeqNo){
		ArrayList<BookVO> list = dao.bookList(upperSeqNo);
		return list;
	}
	
	public ArrayList<BookVO> bookListByBorrowCnt(int upperSeqNo){
		ArrayList<BookVO> list = dao.bookListByBorrowCnt(upperSeqNo);
		return list;
	}
	
	public ArrayList<BookVO> bookListNotBorrowed(int upperSeqNo){
		ArrayList<BookVO> list = dao.bookListNotBorrowed(upperSeqNo);
		return list;
	}
	
	public ArrayList<BookVO> bookListBorrowed(int upperSeqNo){
		ArrayList<BookVO> list = dao.bookListBorrowed(upperSeqNo);
		return list;
	}
	
	public void bookReturn(int ID) {
		dao.bookReturn(ID);
	}
	
	public BookVO bookSearch(int ID) {
		return dao.bookSearch(ID);
	}
	
	public void bookDelete(int ID) {
		dao.bookDelete(ID);
	}
}
