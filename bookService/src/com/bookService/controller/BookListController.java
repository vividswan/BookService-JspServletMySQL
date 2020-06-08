package com.bookService.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookService.bean.BookBean;
import com.bookService.service.BookService;

public class BookListController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookService service = BookService.getInstance();
		ArrayList<BookBean> list = service.bookList();
		
		request.setAttribute("list", list);
		HttpUtil.forward(request, response, "/result/bookListOutput.jsp");
	}
	
}