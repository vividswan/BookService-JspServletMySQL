package com.bookService.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bookService.service.BookService;
import com.bookService.vo.BookVO;

public class BookListController implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BookService service = BookService.getInstance();
		ArrayList<BookVO> list = service.bookList();
		request.setAttribute("list", list);
		
		String indexFlag = (String)request.getAttribute("indexFlag");
		if(indexFlag != null &&indexFlag.equals("firstPage")) {
			HttpUtil.forward(request, response, "/result/bookListOutputFirst.jsp");
		}else if(indexFlag != null &&indexFlag.equals("sortPage")) {
			HttpUtil.forward(request, response, "/result/bookListOutputSort.jsp");
		}else if(indexFlag != null &&indexFlag.equals("borrowedBookPage")) {
			HttpUtil.forward(request, response, "/result/bookListOutputBorrow.jsp");
		}else if(indexFlag != null &&indexFlag.equals("notBorrowedBookPage")) {
			HttpUtil.forward(request, response, "/result/bookListOutputNotBorrow.jsp");
		}else HttpUtil.forward(request, response, "/result/bookListOutput.jsp");
	}
	
}