
package com.bookService.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.bookService.service.BookService;


public class BookReturnController implements Controller {

	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String _ID = (String)request.getAttribute("ID");
		int ID = Integer.parseInt(_ID);
		
		BookService service = BookService.getInstance();
		service.bookReturn(ID);
		HttpUtil.forward(request, response, "bookList.action");
	}


}
