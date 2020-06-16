package com.bookService.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.bookService.service.BookService;


public class BookBorrowController implements Controller {

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String _ID = request.getParameter("ID");
		String path = null;
		if(_ID.isEmpty()) {
			request.setAttribute("error", "ID�� �Է��Ͻÿ�.");
			request.setAttribute("nowTitle", "�뿩");
			HttpUtil.forward(request, response, "/errorPage.jsp");
			return;
		}
		int ID = Integer.parseInt(_ID);
		
		BookService service = BookService.getInstance();
		if(service.bookBorrow(ID)) {
			request.setAttribute("error", "�뿩�� �� �����ϴ�.");
			request.setAttribute("nowTitle", "�뿩");
			HttpUtil.forward(request, response, "/errorPage.jsp");
			return;
		}
		else {
			request.setAttribute("success", "�뿩�Ǿ����ϴ�.");
			request.setAttribute("nowTitle", "�뿩");
			HttpUtil.forward(request, response, "/successPage.jsp");
			return;
		}
		
	}


}
