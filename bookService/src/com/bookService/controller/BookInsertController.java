package com.bookService.controller;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;

import com.bookService.service.BookService;
import com.bookService.vo.BookVO;

public class BookInsertController implements Controller {
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String _ID = request.getParameter("ID");
		String name = request.getParameter("name");
		String author = request.getParameter("author");
		String _price = request.getParameter("price");
		
		if( _ID.isEmpty() || name.isEmpty() || author.isEmpty() ||_price.isEmpty()) {
			request.setAttribute("error", "모든 데이터를 입력하세요.");
			HttpUtil.forward(request, response, "/errorPage.jsp");
			return;
		}
		
		int ID = Integer.parseInt(_ID);
		int price = Integer.parseInt(_price);
		
		BookVO book = new BookVO();
		book.setID(ID);
		book.setName(name);
		book.setAuthor(author);
		book.setPrice(price);
		
		BookService service = BookService.getInstance();
		if(!service.bookInsert(book)) {
			request.setAttribute("error", "이미 있는 ID입니다.");
			request.setAttribute("nowTitle", "추가");
			HttpUtil.forward(request, response, "/errorPage.jsp");
			return;
		}
		else {
			HttpUtil.forward(request, response, "bookList.action");
			return;
		}
	}
	
}