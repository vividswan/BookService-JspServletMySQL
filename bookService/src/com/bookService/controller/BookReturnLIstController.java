package com.bookService.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookService.service.BookService;
import com.bookService.vo.BookVO;

public class BookReturnLIstController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookService service = BookService.getInstance();
		ArrayList<BookVO> list = service.bookList();
		
		request.setAttribute("list", list);
		HttpUtil.forward(request, response, "/result/bookReturnListOutput.jsp");
	}
	
}